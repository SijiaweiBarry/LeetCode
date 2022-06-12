package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/10/14 23:01
 */
public class T990_等式方程的可满足性 {
    private class UnionFind{
        private int[] parent;
        public UnionFind(int n){
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }
        public int find(int x){
            while (x!=parent[x]){
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        public void union(int x,int y){
            int rootX = find(x);
            int rootY = find(y);
            parent[rootX] = rootY;
        }

        public boolean isConnected(int x,int y){
            return find(x) == find(y);
        }
    }
    public boolean equationsPossible(String[] equations) {
        UnionFind unionFind = new UnionFind(26);

        for (String equation : equations) {
            char[] charArray = equation.toCharArray();
            if (charArray[1] == '='){
                int index1 = charArray[0]-'a';
                int index2 = charArray[3]-'a';
                unionFind.union(index1,index2);
            }
        }
        for (String equation : equations) {
            char[] charArray = equation.toCharArray();
            if (charArray[1] =='!'){
                int index1 = charArray[0] - 'a';
                int index2 = charArray[3] - 'a';
                if (unionFind.isConnected(index1,index2)){
                    return false;
                }
            }
        }
        return true;
    }
}
