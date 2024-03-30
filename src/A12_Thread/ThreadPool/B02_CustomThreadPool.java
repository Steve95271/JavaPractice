package A12_Thread.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class B02_CustomThreadPool {
    ThreadPoolExecutor myThreadPoolExecutor = new ThreadPoolExecutor(
            4, //线程核心数，能小于零
            8, //最大线程数，不能小于零，要 >= 核心线程数量
            60, //空闲线程最大存活时间
            TimeUnit.SECONDS, //设定空闲线程最大存活时间的时间单位
            new ArrayBlockingQueue<>(4), //任务阻塞队列
            Executors.defaultThreadFactory(), //创建默认线程工厂
            new ThreadPoolExecutor.AbortPolicy() //Tasks reject policy. It will reject the task and throw a RejectedExecutionException
    );
}
