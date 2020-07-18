package DesignPattern.Singleton;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/8 20:57
 */
//懒汉写法（线程不安全）
public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}

