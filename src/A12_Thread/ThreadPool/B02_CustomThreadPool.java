package A12_Thread.ThreadPool;

import java.util.concurrent.*;

public class B02_CustomThreadPool {
    private static ThreadPoolExecutor myThreadPoolExecutor = new ThreadPoolExecutor(
            4, //线程核心数，能小于零
            8, //最大 线程数，不能小于零，要 >= 核心线程数量
            0, //空闲线程最大存活时间
            TimeUnit.SECONDS, //设定空闲线程最大存活时间的时间单位
            new ArrayBlockingQueue<>(4), //任务阻塞队列
            Executors.defaultThreadFactory(), //创建默认线程工厂
            new ThreadPoolExecutor.AbortPolicy() //Tasks reject policy. It will reject the task and throw a RejectedExecutionException
    );

    public static void main(String[] args) {
        Callable<String> callable = new Callable<>() {
            @Override
            public String call() throws Exception {
                return "Result of callable";
            }
        };

        Future<String> future = myThreadPoolExecutor.submit(callable);

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
