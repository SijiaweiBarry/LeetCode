package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/15 19:59
 */
public class Test1 {
    static class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean isSimilar(TreeNode root1,TreeNode root2){
        if (root1==null&&root2 == null){
            return true;
        }
        if (root1==null||root2==null){
            return false;
        }
        if (root1.val!=root2.val){
            return false;
        }
        return isSimilar(root1.left,root2.left)&&isSimilar(root1.right,root2.right);
    }

//    public static void main(String[] args) {
//        TreeNode a = new TreeNode(1);
//        TreeNode b = new TreeNode(2);
//        TreeNode c = new TreeNode(3);
//        TreeNode d = new TreeNode(4);
//        TreeNode e = new TreeNode(5);
//        TreeNode f = new TreeNode(6);
//        TreeNode g = new TreeNode(7);
//        TreeNode h = new TreeNode(8);
//        a.left = b;
//        a.right = c;
//        b.left = d;
//        b.right = e;
//        c.left = f;
//        d.right = g;
//        e.left = h;
//        TreeNode res = reverse(a);
//
//    }
}
