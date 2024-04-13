package HackerRankIPK;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        System.out.println(posResult);
        System.out.println(negResult);
        System.out.println(zerResult);


    }

    public static void main(String[] args) {
        List arr = new ArrayList<>();
        Collections.addAll(arr, 1, 1, 0, -1, -1);
        plusMinus(arr);
    }

}
