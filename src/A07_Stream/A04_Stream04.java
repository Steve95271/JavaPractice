package A07_Stream;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Stream中的skip和limit方法
 * skip：跳过前几个元素
 * limit：获取前几个原属
 */
public class A04_Stream04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "Alice", "Bob", "Celin", "David", "Eason", "Franco");

        //获取Alice Bob Celin
        list.stream()
                .limit(3)
                .forEach(element -> System.out.println(element));

        System.out.println("-------------------------------");

        //跳过前三位，只打印后三位
        list.stream()
                .skip(3)
                .forEach(element -> System.out.println(element));

        System.out.println("-------------------------------");

        //只打印David
        list.stream()
                .skip(3)
                .limit(1)
                .forEach(element -> System.out.println(element));
    }
}
