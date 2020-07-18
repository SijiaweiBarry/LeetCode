package Leetcode.trees;

import javax.swing.event.TreeExpansionEvent;
import java.util.HashMap;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/13 21:26
 */
public class T106_construct_binary_tree_from_inorder_and_postorder_traversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    HashMap<Integer,Integer>hashMap;
    int[]postorder;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.hashMap = new HashMap<>();
        this.postorder = postorder;
        for (int i = 0; i <inorder.length ; i++) {
            hashMap.put(inorder[i],i);
        }
        return buildTree(0,inorder.length-1,0,postorder.length-1);
    }

    private TreeNode buildTree(int inoLeft, int inoRight, int posLeft, int posRight) {
        if (inoLeft>inoRight||posLeft>posRight){
            return null;
        }
        int pivot = postorder[posRight];
        int index = hashMap.get(pivot);
        TreeNode root = new TreeNode(pivot);
        root.left = buildTree(inoLeft,index-1,posLeft,posLeft+index-inoLeft-1);
        root.right = buildTree(index+1,inoRight,posLeft+index-inoLeft,posRight-1);
    return root;
    }
}
