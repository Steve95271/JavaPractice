package A12_Thread.WaitAndNotify02;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Foodie foodie = new Foodie(queue);
        Cook cook = new Cook(queue);

        foodie.start();
        cook.start();
    }



}
