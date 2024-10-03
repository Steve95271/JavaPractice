package HackerRankIPK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] alphabeticAndNumber = line.split(" ");
            words.add(alphabeticAndNumber[0]);
            numbers.add(Integer.parseInt(alphabeticAndNumber[1]));
        }

        int k = words.size();

        for (int i = 0; i < k; i++) {
            System.out.printf("%-15s", words.get(i));
            System.out.printf("%03d\n", numbers.get(i));
        }
    }

}
