package A12_Thread.Practice.P3;

public class Test3 {
    public static void main(String[] args) {
        HongBaoV3 hongBaoV3 = new HongBaoV3();

        Thread t1 = new Thread(hongBaoV3, "Alice");
        Thread t2 = new Thread(hongBaoV3, "Bob");
        Thread t3 = new Thread(hongBaoV3, "Celin");
        Thread t4 = new Thread(hongBaoV3, "Eason");
        Thread t5 = new Thread(hongBaoV3, "David");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
