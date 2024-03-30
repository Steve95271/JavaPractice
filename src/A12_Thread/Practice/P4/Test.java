package A12_Thread.Practice.P4;

import A12_Thread.MyThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> prizeList = new ArrayList<>();
        Collections.addAll(prizeList, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        LotteryRunnable lotteryRunnable = new LotteryRunnable(prizeList);

        Thread t1 = new Thread(lotteryRunnable, "Alice");
        Thread t2 = new Thread(lotteryRunnable, "Bob");

        t1.start();
        t2.start();
    }
}

class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> prizeList = new ArrayList<>();
        Collections.addAll(prizeList, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        LotteryRunnable2 lotteryRunnable2 = new LotteryRunnable2(prizeList);

        Thread t1 = new Thread(lotteryRunnable2, "Alice");
        Thread t2 = new Thread(lotteryRunnable2, "Bob");

        t1.start();
        t2.start();

    }
}

class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> prizeList = new ArrayList<>();
        Collections.addAll(prizeList, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        LotteryCallable lotteryCallable = new LotteryCallable(prizeList);

        FutureTask<Integer> futureTaskOne = new FutureTask<>(lotteryCallable);
        FutureTask<Integer> futureTaskTwo = new FutureTask<>(lotteryCallable);

        Thread threadOne = new Thread(futureTaskOne, "Alice");
        Thread threadTwo = new Thread(futureTaskTwo, "Bob");

        threadOne.start();
        threadTwo.start();

        //Call the get() method of FutureTask can get the return value
        System.out.println(futureTaskOne.get());
        System.out.println(futureTaskTwo.get());
    }
}