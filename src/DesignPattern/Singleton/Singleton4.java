package DesignPattern.Singleton;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/8 21:37
 */
//静态内部类
public class Singleton4 {
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    private Singleton4(){}
    public static final Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
