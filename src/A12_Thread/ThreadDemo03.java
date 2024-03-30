package A12_Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 多线程的第三种实现方式：
 *  特点：可以获得多线程的结果
 *  1.创建类实现Callable接口
 *  2.重写call方法
 *  3.创建MyCallable对象
 *  4.创建FutureTask，管理多线程运行的结果。
 *  5.创建Thread类的对象，用于启动。
 */
public class ThreadDemo03 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();

        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);

        Thread thread = new Thread(futureTask);

        thread.start();

        //获取多线程结果
        Integer result = futureTask.get();

        System.out.println(result);

    }

}
