package A12_Thread.Practice.P3;

import java.util.Random;

/**
 * 多线程抢红包
 * 三个红包五个人抢
 */
public class HongBao implements Runnable{
    static double amount = 100;
    static final double MIN = 0.01;

    static int count = 3; //总共三个红包

    @Override
    public void run() {
        synchronized (HongBao.class) {
            //获得当前线程
            Thread currentThread = Thread.currentThread();

            //判断红包个数，如果为0，红包被抢完
            if (count == 0) {
                System.out.println(currentThread.getName() + "没抢到红包");
            } else {
                double bonus;
                //如果是最后一个红包，则无需在随机金额，把剩余的进行赋值
                if (count == 1) {
                    bonus = amount;
                } else { //否则是第一次抢红包和第二次抢红包
                    Random rnd = new Random();
                    //100元分三个红包最小可以是0.01，最大是99.98
                    double bounds = amount - (count - 1) * MIN;
                    bonus = rnd.nextDouble(bounds);

                    //由于最小的红包需要是0.01，如果随机到比这个数更小的，应该要把值改为0.01
                    if (bonus < MIN) {
                        bonus = MIN;
                    }
                }
                amount = amount - bonus;
                count--;
                System.out.println(currentThread.getName() + "抽到了" + bonus + "元");
            }
        }
    }
}
