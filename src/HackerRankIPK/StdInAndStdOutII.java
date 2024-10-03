package HackerRankIPK;

import java.util.Scanner;

public class StdInAndStdOutII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        int integerNum = 0;
        double doubleNum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integerNum = scanner.nextInt();
            } else if (scanner.hasNextDouble()) {
                doubleNum = scanner.nextDouble();
            } else {
                s = scanner.nextLine();
            }
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + doubleNum);
        System.out.println("Int: " + integerNum);

    }

}
