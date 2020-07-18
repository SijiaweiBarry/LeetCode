package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/25 20:54
 */
public class T118杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows<1)return null;
        List<List<Integer>>res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for (int i = 1; i <numRows ; i++) {
            List<Integer>pre = res.get(i-1);
            List<Integer>rowNum = new ArrayList<>();
            rowNum.add(1);
            for (int j = 1; j <i ; j++) {
                rowNum.add(pre.get(j-1)+pre.get(j));
            }
            rowNum.add(1);
            res.add(rowNum);
        }
        return res;
    }
}
