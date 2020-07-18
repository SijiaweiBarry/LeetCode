package DesignPattern.Singleton;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/8 21:28
 */

//懒汉式写法（线程安全）

public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}
    private static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
