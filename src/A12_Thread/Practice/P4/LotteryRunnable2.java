package A12_Thread.Practice.P4;

import A12_Thread.MyThread;

import java.util.ArrayList;
import java.util.Collections;

public class LotteryRunnable2 implements Runnable{
    ArrayList<Integer> prizeList;
    public LotteryRunnable2(ArrayList<Integer> prizeList) {
        this.prizeList = prizeList;
    }
    ArrayList<Integer> alicePrizeList = new ArrayList<>();
    ArrayList<Integer> bobPrizeList = new ArrayList<>();

    static boolean flag = true;

    @Override
    public void run() {
        //method1();
        method2();
    }

    /**
     * 第一种方法：
     *  这种方法有局限性，只能运行固定的两个线程。
     *  因为用于储存玩家的ArrayList被固定在了两个。
     */
    private void method1() {
        while (flag) {
            synchronized (LotteryRunnable2.class) {
                Thread currentThread = MyThread.currentThread();
                if (prizeList.size() > 0) {
                    Collections.shuffle(prizeList);
                    int prize = prizeList.remove(0);
                    if (currentThread.getName().equals("Alice")) {
                        alicePrizeList.add(prize);
                    } else {
                        bobPrizeList.add(prize);
                    }
                } else {
                    flag = false;
                    if (currentThread.getName().equals("Alice")) {
                        System.out.println("Alice " + alicePrizeList);
                    } else {
                        System.out.println("Bob " + bobPrizeList);
                    }
                }
            }
        }
    }

    /**
     * 第二种方式：
     *  把ArrayList定义在Run方法中，这样当线程抢到了执行权时会创建自己的ArrayList
     *  这样种方法可以应对多于两个线程的情况。
     */
    private void method2() {
        /*
            ArrayList需要定义在循环外面。
            这样当线程抢到执行权之后就能够创建属于线程自己的ArrayList，然后在循环中添加并打印所有数据。
            如果定义在循环内，每一次循环都会创建一个ArrayList，会将抽到的奖清空。
         */

        ArrayList<Integer> playerPrizeList = new ArrayList<>();

        while (flag) {
            synchronized (LotteryRunnable2.class) {
                Thread currentThread = MyThread.currentThread();
                if (prizeList.size() > 0) {
                    Collections.shuffle(prizeList);
                    int prize = prizeList.remove(0);
                    playerPrizeList.add(prize);
                } else {
                    flag = false;
                    System.out.println(currentThread.getName() + " " + playerPrizeList);
                }
            }
        }
    }
}
