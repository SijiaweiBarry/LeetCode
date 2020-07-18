package DesignPattern.Singleton;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/8 21:32
 */
//饿汉式写法
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return instance;
    }
}
