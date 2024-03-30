package A12_Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo10_Lock {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Alice");
        t2.setName("Bob");
        t3.setName("Celian");

        t1.start();
        t2.start();
        t3.start();
    }

    private static class MyThread extends Thread {
        static int ticket = 0;

        static boolean flag = true;
        static Lock lock = new ReentrantLock();

        @Override
        public void run() {


            while (flag) {
                lock.lock();
                if (ticket < 100) {
                    ticket++;
                    System.out.println(getName() + ": " + ticket);
                } else {
                    flag = false;
                }
                lock.unlock();
            }
        }
    }

}
