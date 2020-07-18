package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/13 19:53
 */
public class T359日志速率限制器 {
    private HashMap<String,Integer>map;
    /** Initialize your data structure here. */
    public T359日志速率限制器() {
        map = new HashMap<String,Integer>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message)){
            map.put(message,timestamp);
            return true;
        }
        int t = map.get(message);
        if (timestamp-t>10){
            map.put(message,timestamp);
            return true;
        }else {return false;}
    }
}
