package HackerRankIPK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        ArrayList<Integer> leftDiagonal = new ArrayList<>();
        ArrayList<Integer> rightDiagonal = new ArrayList<>();

        int a = 0;
        int b = 0;

        int j = arr.size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            Integer num1 = arr.get(i).get(i);
            leftDiagonal.add(num1);
            a = a + num1;

            Integer num2 = arr.get(i).get(j);
            rightDiagonal.add(num2);
            b = b + num2;
            j--;
        }

        System.out.println(leftDiagonal);
        System.out.println(rightDiagonal);

        System.out.println(a);
        System.out.println(b);

        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(11);
        arr1.add(2);
        arr1.add(4);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);

        List<Integer> arr3 = new ArrayList<>();
        arr3.add(10);
        arr3.add(8);
        arr3.add(-12);

        Collections.addAll(arr, arr1, arr2, arr3);

        System.out.println(diagonalDifference(arr));
    }

}
