package A12_Thread;

/**
 * 多线程的第二种启动方式：
 *  定义一个类实现Runnable接口
 *  重写run方法
 *  创建实现Runnable接口的类的对象
 *
 */
public class MyRunable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            //获取当前线程对象
            Thread t = Thread.currentThread();

            System.out.println(t.getName() + ": Yo what's up " + i);
        }
    }
}
