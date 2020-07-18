package Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/10 16:35
 */
public class T146_LRU缓存机制 extends LinkedHashMap<Integer,Integer> {
    private int capacity;

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size()>capacity;
    }

    public T146_LRU缓存机制(int capacity) {
        super(capacity,0.75F,true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        super.put(key,value);
    }
}
