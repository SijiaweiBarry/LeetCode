package Leetcode.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/28 9:38
 */
/*
655. 输出二叉树

在一个 m*n 的二维字符串数组中输出二叉树，并遵守以下规则：

行数 m 应当等于给定二叉树的高度。
列数 n 应当总是奇数。
根节点的值（以字符串格式给出）应当放在可放置的第一行正中间。根节点所在的行与列会将剩余空间划分为两部分（左下部分和右下部分）。你应该将左子树输出在左下部分，右子树输出在右下部分。左下和右下部分应当有相同的大小。即使一个子树为空而另一个非空，你不需要为空的子树输出任何东西，但仍需要为另一个子树留出足够的空间。然而，如果两个子树都为空则不需要为它们留出任何空间。
每个未使用的空间应包含一个空的字符串""。
使用相同的规则输出子树。
示例 1:

输入:
     1
    /
   2
输出:
[["", "1", ""],
 ["2", "", ""]]
示例 2:

输入:
     1
    / \
   2   3
    \
     4
输出:
[["", "", "", "1", "", "", ""],
 ["", "2", "", "", "", "3", ""],
 ["", "", "4", "", "", "", ""]]
示例 3:

输入:
      1
     / \
    2   5
   /
  3
 /
4
输出:
[["",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""]
 ["",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""]
 ["",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]
 ["4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/print-binary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T655_print_binary_tree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public List<List<String>> printTree(TreeNode root) {
        List<List<String>>ans = new ArrayList<>();
        int h = treeHeight(root);
        int w = (1<<h)-1;
        for (int i = 0; i < h ; i++) {
            List<String>temp = new ArrayList<>();
            for (int j = 0; j < w; j++) {
                temp.add("");
            }
            ans.add(temp);
        }
        help(root,ans,0,0,w-1);
        return ans;
    }

    private void help(TreeNode root,List<List<String>>ans,int height, int left, int right) {
        if (root == null)return;
        int mid = (left+right)/2;
        ans.get(height).set(mid,Integer.toString(root.val));
        help(root.left,ans,height+1,left,mid-1);
        help(root.right,ans,height+1,mid+1,right);
    }

    private int treeHeight(TreeNode root) {
        if (root==null)return 0;
        int leftH = treeHeight(root.left);
        int rightH = treeHeight(root.right);
        return Math.max(leftH,rightH)+1;
    }
}
