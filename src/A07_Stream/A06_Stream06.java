package A07_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

/**
 * split分割字符串
 */
public class A06_Stream06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Gray-16", "Hysenbrugh-17", "Issa-18", "Jack-19");
        
        list.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        String[] arr = s.split("-");
                        System.out.println(Arrays.toString(arr));
                        String ageString = arr[1];
                        return Integer.parseInt(ageString);
                    }
                }).forEach(element -> System.out.println("Age: " + element));

        System.out.println("------------------");

        list.stream()
                .map(element -> Integer.parseInt(element.split("-")[1]))
                .forEach(element -> System.out.println("Age: " + element));

    }
}
