package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/14 12:14
 */
public class Test {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public  boolean isSameTree(TreeNode tree1,TreeNode tree2){
        if (tree1==null&&tree2==null){//若两棵树均为空
            return true;
        }
        else if (tree1==null||tree2==null){//若两棵树有一方为空
            return false;
        }

            if(tree1.val!=tree2.val){
                return false;
            }
            else {
                return isSameTree(tree1.left,tree2.left)&&isSameTree(tree1.right,tree2.right);
            }


    }

}
