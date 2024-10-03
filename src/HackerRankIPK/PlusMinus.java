package HackerRankIPK;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        BigDecimal bdTotal = BigDecimal.valueOf(arr.stream().count());
        BigDecimal bdPositive = BigDecimal.valueOf(arr.stream().filter(element -> element > 0).count());
        BigDecimal bdNegative = BigDecimal.valueOf(arr.stream().filter(element -> element < 0).count());
        BigDecimal bdZero = BigDecimal.valueOf(arr.stream().filter(element -> element == 0).count());

        BigDecimal posResult = bdPositive.divide(bdTotal, 6, RoundingMode.HALF_UP);
        BigDecimal negResult = bdNegative.divide(bdTotal, 6, RoundingMode.HALF_UP);
        BigDecimal zerResult = bdZero.divide(bdTotal, 6, RoundingMode.HALF_UP);

/*        System.out.println(posResult);
        System.out.println(negResult);
        System.out.println(zerResult);*/

        int zero = 0;
        int positive = 0;
        int negative = 0;

        for (Integer num : arr) {
            if (num == 0) {
                zero += 1;
            } else if (num > 0) {
                positive += 1;
            } else {
                negative += 1;
            }
        }

        System.out.println("Zero: " + zero);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Total: " + arr.size());


    }

    public static void main(String[] args) {
        List arr = new ArrayList<>();
        Collections.addAll(arr, 1, 1, 0, -1, -1);
        plusMinus(arr);
    }

}
