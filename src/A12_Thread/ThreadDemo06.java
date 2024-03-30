package A12_Thread;

/**
 * 守护线程演示
 */
public class ThreadDemo06 {
    public static void main(String[] args) {
        MyRunable mr = new MyRunable();

        Thread t2 = new Thread(mr, "Bob");

        MyThread t1 = new MyThread();

        t1.setName("Alice");

        //t1.setDaemon(true);
        t2.setDaemon(true); //Thread2被设置为守护线程之后，会在Thread1的方法运行完之后结束进程

        t1.start();
        t2.start();
    }
}
