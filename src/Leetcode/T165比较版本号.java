package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/1 17:42
 */
public class T165比较版本号 {
    public int compareVersion(String version1, String version2) {
        String[]s1 = version1.split("//.");
        String[]s2 = version2.split("//.");
        int m = s1.length;
        int n = s2.length;
        for (int i = 0; i < Math.max(m,n); i++) {
            int num1 = i < m ? Integer.valueOf(s1[i]):0;
            int num2 = i < n ? Integer.valueOf(s2[i]):0;
            if (num1<num2){
                return -1;
            }
            if (num2<num1){
                return 1;
            }
        }
        return 0;
    }
}
