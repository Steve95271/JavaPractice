package A12_Thread;

/**
 * 使用同步代码块解决线程安全问题
 */
public class ThreadDemo08 {

    public static void main(String[] args) {

        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();

        t1.setName("Alice");
        t2.setName("Bob");
        t3.setName("Celin");

        t1.start();
        t2.start();
        t3.start();

    }



}
