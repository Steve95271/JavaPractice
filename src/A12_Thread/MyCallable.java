package A12_Thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {

        //求和
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }

        return sum;

    }
}
