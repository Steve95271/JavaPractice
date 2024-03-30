package A12_Thread.ThreadPool;

/**
 * 获取电脑的线程最大并行数
 */
public class B03_MaxRunningThread {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
