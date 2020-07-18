package DesignPattern.Singleton.Producer_Consumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author SijiaweiBarry
 * @create 2020/10/3 9:59
 */
public class Producer implements Runnable{
    private volatile boolean isRunning = true;
    private BlockingQueue<Integer>queue;
    private static AtomicInteger count = new AtomicInteger();
    private static final int SLEEPTIME = 1000;

    public Producer(BlockingQueue<Integer>queue){
        this.queue = queue;
    }


    @Override
    public void run() {
        int data;
        Random r = new Random();
        System.out.println("start producer id = ");
    }
}
