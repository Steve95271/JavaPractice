package A12_Thread;

/**
 * 多线程的常用成员方法
 * <p>
 * String getName()                    返回此线程的名称
 * void setName(String name)           设置线程的名字（构造方法也可以设置名字）
 * 细节：
 * 1、如果我们没有给线程设置名字，线程也是有默认的名字的
 * 格式：Thread-X（X序号，从0开始的）
 * 2、如果我们要给线程设置名字，可以用set方法进行设置，也可以构造方法设置
 * <p>
 * static Thread currentThread()       获取当前线程的对象
 * 细节：
 * 当JVM虚拟机启动之后，会自动的启动多条线程
 * 其中有一条线程就叫做main线程
 * 他的作用就是去调用main方法，并执行里面的代码
 * 在以前，我们写的所有的代码，其实都是运行在main线程当中
 * <p>
 * static void sleep(long time)        让线程休眠指定的时间，单位为毫秒
 * 细节：
 * 1、哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
 * 2、方法的参数：就表示睡眠的时间，单位毫秒
 * 1 秒= 1000毫秒
 * 3、当时间到了之后，线程会自动的醒来，继续执行下面的其他代码
 */
public class ThreadDemo04 {

    private static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println(getName() + ": " + i);
                try {
                    //每过一千毫秒再执行
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.setName("Alice");

        MyThread mt2 = new MyThread();
        mt2.setName("Bob");

        mt1.start();
        mt2.start();
    }



}
