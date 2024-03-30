package A12_Thread.Practice.P3;

public class Test {
    public static void main(String[] args) {
        HongBao hbRunnable = new HongBao();
        Thread t1 = new Thread(hbRunnable, "Alice");
        Thread t2 = new Thread(hbRunnable, "Bob");
        Thread t3 = new Thread(hbRunnable, "Celin");
        Thread t4 = new Thread(hbRunnable, "David");
        Thread t5 = new Thread(hbRunnable, "Eason");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
