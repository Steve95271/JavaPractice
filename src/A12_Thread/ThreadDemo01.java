package A12_Thread;

/**
 * 多线程启动的第一种方式：
 *  自己定义一个类实现Thread接口。
 *  重写run方法。
 *  创建自己的类的对象。
 */
public class ThreadDemo01 {
    public static void main(String[] args) {

        MyThread firstThread = new MyThread();
        MyThread secondThread = new MyThread();

        firstThread.setName("Thread 1");
        secondThread.setName("Thread 2");

        firstThread.start();
        secondThread.start();

    }
}
