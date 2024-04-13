package HackerRankIPK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5,4,3,2,1);

        miniMaxSum(list);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);

        long min = 0;
        long max = 0;

        for (int i = 0; i <= arr.size() - 2; i++) {
            min = min + arr.get(i);
        }

        for (int i = 1; i <= arr.size() - 1; i++) {
            max = max + arr.get(i);
        }

        System.out.println(min + " " + max);
    }
}
