package com.saul.interviewForJava.剑指offer.树;

import org.junit.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther: Saul
 * @Date: 23/4/20 14:32
 * @Description:
 */
public class TreeProblem {

    /***
     * @Author Saul
     * @Description  TODO: 由中序遍历和后序遍历重构树
     * @Date 15:18 23/4/20
     * @param inOrder 中序遍历数组
     * @param postOrder 后序遍历数组
     * @return {@link {@link TreeNode}}
     */
    public TreeNode reConstructTree(int[] inOrder, int[] postOrder){
        if(inOrder == null || postOrder == null || inOrder.length == 0 || postOrder.length == 0) return null;
        return construct(inOrder, postOrder);
    }

    private TreeNode construct(int[] inOrder, int[] postOrder){
        TreeNode root = new TreeNode(postOrder[postOrder.length-1]);
        if (postOrder.length == 1 && inOrder.length == 1){
            return root;
        }

        int rootIndex = -1;
        for (int i = 0; i < inOrder.length; i++){
            if(postOrder[postOrder.length-1] == inOrder[i]){
                rootIndex = i;
                break;
            }
        }

        int[] leftTreeInOrder = Arrays.copyOfRange(inOrder, 0, rootIndex);
        int[] leftTreePostOrder = Arrays.copyOfRange(postOrder, 0, rootIndex);
        root.left = construct(leftTreeInOrder,leftTreePostOrder);

        int[] rightTreeInOrder = Arrays.copyOfRange(inOrder, rootIndex+1, inOrder.length);
        int[] rightTreePostOrder = Arrays.copyOfRange(postOrder, rootIndex, postOrder.length - 1);
        root.right = construct(rightTreeInOrder, rightTreePostOrder);


        return root;

    }

    /***
     * @Author Saul
     * @Description  TODO: 层次遍历
     * @Date 15:26 23/4/20
     * @param root 树根节点
     */
    public void levelTraverse(TreeNode root){
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode temp;
        if (root != null){
            queue.offer(root);
        }

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                temp = queue.poll();
                System.out.print(temp.val + "  ");
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
                size--;
            }
            System.out.println();
        }
    }

    public void inorder(TreeNode root){
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){

        }

        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }

    }


    @Test
    public void test(){
        int[] in = new int[]{9,3,15,20,7};
        int[] post = new int[]{9,15,7,20,3};
        TreeNode root = reConstructTree(in, post);
        levelTraverse(root);
        inorder(root);
    }

}
