package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/10 14:17
 */

import java.util.ArrayDeque;
import java.util.Queue;

/**297. 二叉树的序列化与反序列化
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 *
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 *
 * 示例: 
 *
 * 你可以将以下二叉树：
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * 序列化为 "[1,2,3,null,null,4,5]"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T297_二叉树的序列化与反序列化 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    /**
     *     Encodes a tree to a single string.
     */
    public String serialize(TreeNode root) {
        if (root==null){
            return "#!";
        }
        String str = root.val+"!";
        str += serialize(root.left);
        str += serialize(root.right);
        return str;
    }
    /**
     *     Decodes your encoded data to tree.
     */
    public TreeNode deserialize(String data) {
        String[]strings = data.split("!");
        Queue<String>queue = new ArrayDeque<>();
        for (int i = 0; i < strings.length; i++) {
            queue.add(strings[i]);
        }
        return deserialize(queue);
    }
    public TreeNode deserialize(Queue<String> queue) {
        String cur = queue.poll();
        if (cur.equals("#")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(cur));
        root.left = deserialize(queue);
        root.right = deserialize(queue);
        return root;
    }
}
