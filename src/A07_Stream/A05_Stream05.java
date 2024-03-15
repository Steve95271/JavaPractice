package A07_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * 演示distinct和concat方法
 * distinct：元素去重
 * concat：合并两个stream
 */
public class A05_Stream05 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "Alice", "Alice", "Alice", "Bob", "Celin", "David", "Eason", "Franco");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "Gray", "Hysenbrugh", "Issak", "Jack");

        //distinct
        System.out.print("Distinct: ");
        list1.stream()
                .distinct()
                .forEach(element -> System.out.print(element + " "));

        System.out.println();

        //concat
        System.out.print("Concat: ");
        Stream.concat(list1.stream(), list2.stream())
                .forEach(element -> System.out.print(element + " "));
    }
}
