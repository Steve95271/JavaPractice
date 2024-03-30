package A12_Thread.Practice.P3;

public class Test2 {

    public static void main(String[] args) {
        HongBaoV2 hongBaoV2 = new HongBaoV2();

        Thread t1 = new Thread(hongBaoV2, "Alice");
        Thread t2 = new Thread(hongBaoV2, "Bob");
        Thread t3 = new Thread(hongBaoV2, "Celin");
        Thread t4 = new Thread(hongBaoV2, "David");
        Thread t5 = new Thread(hongBaoV2, "Eason");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
