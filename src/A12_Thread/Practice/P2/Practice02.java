package A12_Thread.Practice.P2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Practice02 {
    public static void main(String[] args) {
        GiftRunnable giftRunnable = new GiftRunnable();

        Thread fristThread = new Thread(giftRunnable, "Alice");
        Thread secondThread = new Thread(giftRunnable, "Bob");

        fristThread.start();
        secondThread.start();
    }

    private static class GiftRunnable implements Runnable {
        private static int giftAmount = 100;
        private static boolean flag = true;
        private static Lock lock = new ReentrantLock();


        @Override
        public void run() {
            while (flag) {
                lock.lock();
                if (giftAmount > 10) {
                    giftAmount--;
                    Thread currentThread = Thread.currentThread();
                    System.out.println(currentThread.getName() + " 送出了一份礼物，剩余：" + giftAmount);
                } else {
                    flag = false;
                }
                lock.unlock();
            }
        }
    }
}
