package Leetcode.backtracking;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/22 21:04
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 131. 分割回文串
 * 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 *
 * 返回 s 所有可能的分割方案。
 *
 * 示例:
 *
 * 输入: "aab"
 * 输出:
 * [
 *   ["aa","b"],
 *   ["a","a","b"]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-partitioning
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T131_palindrome_partitioning {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
       int len = s.length();
       if (len==0){
           return res;
       }
       Deque<String>path = new ArrayDeque<>();
       backTracking(s,path,len,0,res);
       return res;
    }

    private void backTracking(String s, Deque<String> path, int len, int start, List<List<String>> res) {
        if (start==len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <len ; i++) {
            if (!isPalindrome(s,start,i)){
                continue;
            }
            path.addLast(s.substring(start,i+1));
            backTracking(s,path,len,i+1,res);
            path.removeLast();
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


