package A12_Thread;

/**
 * 设置线程优先级：
 *  可以调用方法setPriority()进行设置。
 *  优先级有最大值10和最小值1。
 *  数值越少越先执行。
 *
 * 注意：
 *  执行的优先级有概率性，不再是设置的优先级越高就一定先执行完毕。
 */
public class ThreadDemo05 {
    public static void main(String[] args) {
        /*
            setPriority(int newPriority)    设置线程的优先级
            final int getPriority()         获取线程的优先级
         */

        MyRunable mr = new MyRunable();

        Thread t1 = new Thread(mr, "Alice");
        Thread t2 = new Thread(mr, "Bob");

        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();

    }
}
