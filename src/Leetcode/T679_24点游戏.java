package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/6 11:56
 */
public class T679_24点游戏 {
    public boolean judgePoint24(int[] nums) {
        if (nums.length==0)return false;
        List<Double>nowNum = new ArrayList<>();
        for (int num : nums) {
            nowNum.add((double)num);
        }
        return help(nowNum);
    }

    private boolean help(List<Double> nowNum) {
        if (nowNum.size()==1)return nowNum.get(0)<1e-6;
        for (int i = 0; i <nowNum.size() ; i++) {
            for (int j = 0; j <nowNum.size() ; j++) {
                if (i==j)continue;
                List<Double>newNum = new ArrayList<>();
                for (int k = 0; k <nowNum.size() ; k++) {
                    if (k!=i&&k!=j){
                        newNum.add(nowNum.get(k));
                    }
                }
                for (int time = 0; time <4 ; time++) {
                    if (i>j&&time<2)continue;
                    if (time==0) newNum.add(nowNum.get(i)+nowNum.get(j));
                    if (time==1) newNum.add(nowNum.get(i)*nowNum.get(j));
                    if (time==2) newNum.add(nowNum.get(i)-nowNum.get(j));
                    if (time==3) if (nowNum.get(j)!=0){newNum.add(nowNum.get(i)/nowNum.get(j));}else {continue;}
                    if (help(newNum)){return true;}
                    newNum.remove(newNum.size()-1);
                }
            }
        }
        return false;
    }
}
