package A12_Thread.WaitAndNotify;

public class Foodie extends Thread{

    @Override
    public void run() {
        while(true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }else{
                    //先判断桌子上是否有面条
                    if (Desk.foodFlag == 0) {
                        //如果没有，等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        //面条总数减一
                        Desk.count--;
                        //开吃
                        System.out.println("吃了一碗面，还剩下：" + Desk.count + "碗");
                        //唤醒厨师继续做
                        Desk.lock.notifyAll();
                        //修改桌子状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
