package Leetcode.trees;

import javax.jnlp.IntegrationService;
import java.util.HashMap;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/13 21:05
 */
public class T105_construct_binary_tree_from_preorder_and_inorder_traversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    HashMap<Integer,Integer>hashMap ;
    int[]preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.hashMap = new HashMap<>();
        this.preorder = preorder;
        for (int i = 0; i <inorder.length ; i++) {
            hashMap.put(inorder[i],i);
        }
        int preLen = preorder.length;
        int inoLen = inorder.length;
        return buildTree(0,preLen-1,0,inoLen-1);

    }

    private TreeNode buildTree(int preLeft, int preRight, int inoLeft, int inoRight) {
        if (preLeft>preRight||inoLeft>inoRight){
            return null;
        }
        int pivot = preorder[preLeft];
        TreeNode pi = new TreeNode(pivot);
        int index = hashMap.get(pivot);
        pi.left = buildTree(preLeft+1,index-inoLeft+preLeft,inoLeft,index-1);
        pi.right = buildTree(index-inoLeft+preLeft+1,preRight,index+1,inoRight);
        return pi;
    }
}
