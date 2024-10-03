package A12_Thread;

public class ThreadDemo11 {
    public static void main(String[] args) {
        new Thread(() -> {
            samplePrint();
        }).start();

        new Thread(() -> {
            samplePrint();
        }).start();
    }

    private static void samplePrint() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": hi");
        }
    }
}
