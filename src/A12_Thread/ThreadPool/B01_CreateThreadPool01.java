package A12_Thread.ThreadPool;


import A12_Thread.MyRunable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class B01_CreateThreadPool01 {
    public static void main(String[] args) {
        //使用Executors.newFixedThreadPool()方法可以指定创建的线程池能够运行几条线程
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new MyRunable());
        executorService.submit(new MyRunable());
        executorService.submit(new MyRunable());
        executorService.submit(new MyRunable());
        executorService.submit(new MyRunable());

        //关闭线程池
        executorService.shutdown();
    }
}
