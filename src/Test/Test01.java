package Test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] charArray = A.toCharArray();
        int charArrayLength = charArray.length;

        if (charArrayLength == 1) {
            System.out.println("No");
            return;
        } else if (charArrayLength % 2 == 0) {
            int midToRight = (charArrayLength / 2);
            for (int midToLeft = (charArrayLength / 2) - 1; midToLeft >= 0; midToLeft--) {
                if(charArray[midToLeft] != charArray[midToRight]) {
                    System.out.println("No");
                    break;
                } else if (midToLeft == 0) {
                    System.out.println("Yes");
                }
                midToRight++;
            }
        } else {
            int midToRight = (charArrayLength / 2) + 1;
            for (int midToLeft = (charArrayLength / 2) - 1; midToLeft >= 0; midToLeft--) {
                if(charArray[midToLeft] != charArray[midToRight]) {
                    System.out.println("No");
                    break;
                } else if (midToLeft == 0) {
                    System.out.println("Yes");
                }
                midToRight++;
            }
        }

    }
}
