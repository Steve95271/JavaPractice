package A12_Thread;

/**
 * 多线程的第二种启动方式：
 *  定义一个类实现Runnable接口
 *  重写run方法
 *  创建实现Runnable接口的类的对象
 *
 */
public class ThreadDemo02 {

    public static void main(String[] args) {
        MyRunable mr = new MyRunable();

        Thread threadOne = new Thread(mr);
        Thread threadTwo = new Thread(mr);

        threadOne.setName("T1");
        threadTwo.setName("T2");

        //用start()方法启动。
        threadOne.start();
        threadTwo.start();
    }

}
