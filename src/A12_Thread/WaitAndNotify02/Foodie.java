package A12_Thread.WaitAndNotify02;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师放了一晚面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
