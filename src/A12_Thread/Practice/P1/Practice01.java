package A12_Thread.Practice.P1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Practice01 {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket, "Alice");
        Thread t2 = new Thread(ticket, "Bob");

        t1.start();
        t2.start();
    }

    private static class Ticket implements Runnable {
        private static int ticket = 1000;

        private static boolean flag = true;

        private static Lock lock = new ReentrantLock();

        @Override
        public void run() {

            while (flag) {
                lock.lock();
                if (ticket >= 0) {
                    Thread currentThread = Thread.currentThread();
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(currentThread.getName() + " draft one ticket. " + ticket + " left");
                    ticket--;
                } else {
                    flag = false;
                }
                lock.unlock();
            }

        }
    }

}
