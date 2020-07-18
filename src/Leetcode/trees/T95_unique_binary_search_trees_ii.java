package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/8 12:49
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
 *
 *  
 *
 * 示例：
 *
 * 输入：3
 * 输出：
 * [
 *   [1,null,3,2],
 *   [3,2,null,1],
 *   [3,1,null,null,2],
 *   [2,1,3],
 *   [1,null,2,null,3]
 * ]
 * 解释：
 * 以上的输出对应以下 5 种不同结构的二叉搜索树：
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-binary-search-trees-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T95_unique_binary_search_trees_ii {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>ans = new ArrayList<>();
        if (n==0){
            return ans;
        }
        return getAns(1,n);
    }

    private List<TreeNode> getAns(int start, int end) {
        List<TreeNode>ans = new ArrayList<>();
        if (start>end){
            ans.add(null);
            return ans;
        }
        if (start==end){
            ans.add(new TreeNode(start));
            return ans;
        }
        for (int i = start; i <=end ; i++) {
            List<TreeNode>left = getAns(start,i-1);
            List<TreeNode>right = getAns(i+1,end);
            for (TreeNode treeNode : left) {
                for (TreeNode node : right) {
                    TreeNode t = new TreeNode(i);
                    t.left = treeNode;
                    t.right = node;
                    ans.add(t);
                }
            }
        }
        return ans;
    }

}
