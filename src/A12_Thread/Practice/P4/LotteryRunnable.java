package A12_Thread.Practice.P4;

import A12_Thread.MyThread;

import java.util.ArrayList;
import java.util.Collections;

public class LotteryRunnable implements Runnable{
    ArrayList<Integer> prizeList;

    public LotteryRunnable (ArrayList<Integer> prizeList) {
        this.prizeList = prizeList;
    }

    static boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            synchronized (LotteryRunnable.class) {
                Thread currentThread = MyThread.currentThread();
                if (prizeList.size() > 0) {
                    Collections.shuffle(prizeList);
                    int prize = prizeList.remove(0);
                    System.out.println(currentThread.getName() + " 抽取到了: " + prize + "元");
                } else {
                    flag = false;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
