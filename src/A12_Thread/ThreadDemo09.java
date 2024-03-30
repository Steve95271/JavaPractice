package A12_Thread;

/**
 * 使用同步方法实现线程安全
 */
public class ThreadDemo09 {
    public static void main(String[] args) {
        TicketRunnable tr = new TicketRunnable();

        Thread t1 = new Thread(tr, "Alice");
        Thread t2 = new Thread(tr, "Bob");
        Thread t3 = new Thread(tr, "Celin");

        t1.start();
        t2.start();
        t3.start();
    }

    private static class TicketRunnable implements Runnable {

        int ticket = 0;

        @Override
        public void run() {

            while (true) {
                if (method()) break;
            }

        }

        private synchronized boolean method() {

            if (ticket == 100) {
                return true;
            } else {
                ticket++;
                System.out.println(Thread.currentThread().getName() + ": " + ticket);
            }

            return false;

        }

    }
}
