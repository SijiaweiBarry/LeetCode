package DesignPattern.Singleton.Producer_Consumer;

import java.util.concurrent.BlockingQueue;

/**
 * @Author SijiaweiBarry
 * @create 2020/10/3 1:23
 */
public   class  ProducerQueue  implements  Runnable {

    private   final BlockingQueue proQueue ;

    public  ProducerQueue(BlockingQueue proQueue)
    {
        this  . proQueue  =proQueue;
    }

    @Override
    public   void  run() {

        for  ( int  i=0;i<10;i++)
        {
            try  {
                System.out.println( "生产者生产的消息编号为 : "  +i);   //放入十个消息编号 为1到10
                proQueue.put(i);

                /*Thread.sleep(3000);*/
            }  catch  (InterruptedException  e) {
                e.printStackTrace();
            }

        }

    }


}
