package A12_Thread.WaitAndNotify;

public class Cook extends Thread{

    @Override
    public void run() {
        while(true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                  //判断桌子上是否有面条，有就等待
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("厨师做了一碗面");
                        //修改桌子上面的状态
                        Desk.foodFlag = 1;
                        //唤醒
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
