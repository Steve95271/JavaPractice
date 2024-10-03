package HackerRankIPK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LonelyInteger {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers, 34, 95, 34, 64, 45, 95, 16, 80, 80, 75, 3, 25, 75, 25, 31, 3, 64, 16, 31);

        int uniqueNum = -1;

        /*for (Integer number : numbers) {
            if (Collections.frequency(numbers, number) == 1) {
                uniqueNum = number;
            }
        }*/

        System.out.println(uniqueNum);

        //int lonelyinteger = lonelyinteger(numbers);

        //System.out.println(lonelyinteger);

    }

    public static int lonelyinteger(List<Integer> numbers) {
        // Write your code here
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (Integer number : numbers) {
            if (!hashMap.containsKey(number)) {
                hashMap.put(number, 1);
            } else {
                hashMap.put(number, 2);
            }
        }

        for (Integer i : hashMap.keySet()) {
            if (hashMap.get(i) == 1) {
                return i;
            }
        }

        return -1;
    }
}
