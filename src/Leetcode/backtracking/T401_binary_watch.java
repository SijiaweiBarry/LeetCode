package Leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/2 20:54
 */
/*
401. 二进制手表
二进制手表顶部有 4 个 LED 代表 小时（0-11），底部的 6 个 LED 代表 分钟（0-59）。

每个 LED 代表一个 0 或 1，最低位在右侧。

给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。
 
示例：

输入: n = 1
返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]

提示：

输出的顺序没有要求。
小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。
分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。
超过表示范围（小时 0-11，分钟 0-59）的数据将会被舍弃，也就是说不会出现 "13:00", "0:61" 等时间。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/binary-watch
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
public class T401_binary_watch {
    List<String> ans = new ArrayList<>();
    public List<String> readBinaryWatch(int num) {
        if (num<=0){
            return ans;
        }
        int visited[] = new int[10];
        backtracking(0,visited,num,0);
        return ans;
    }

    private void backtracking(int cur, int[] visited, int num, int depth) {
        if (depth==num){
            int hours = visited[0]*1+visited[1]*2+visited[2]*4+visited[3]*8;
            int minutes = visited[4]*1+visited[5]*2+visited[6]*4+visited[7]*8+visited[8]*16+visited[9]*32;
            if (hours<12&&minutes<60){
                ans.add(String.format("%d:%02d",hours,minutes));
            }
            return;
        }
        for (int i = cur; i <10 ; i++) {
            visited[i]=1;
            backtracking(i+1,visited,num,depth+1);
            visited[i]=0;
        }
    }
}
