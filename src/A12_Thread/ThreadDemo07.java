package A12_Thread;

/**
 * 插入线程
 */
public class ThreadDemo07 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();

        mt.start();

        //使用join()方法可以使得线程的代码运行在main之前
        //如果不使用join()，会先打印完50个Hi先
        mt.join();

        for (int i = 0; i < 50; i++) {
            System.out.println("Hi");
        }

    }
}
