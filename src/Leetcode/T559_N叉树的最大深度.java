package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/24 22:22
 */
public class T559_N叉树的最大深度 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    int ans = 0;
    public int maxDepth(Node root) {
        if (root==null){
            return 0;
        }
        List<Integer>temp = new ArrayList<>();
        for (int i = 0; i < root.children.size(); i++) {
            temp.add(maxDepth(root.children.get(i)));
        }
        int max = 0;
        for (Integer integer : temp) {
            if (max<integer){
                max = integer;
            }
        }
        return max+1;
    }
}
