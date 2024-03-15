package A07_Stream;

import java.util.HashMap;

/**
 * 双列集合无法直接使用stream API。
 * 例如HashMap需要使用其中的方法转换成Collection类再使用stream API。
 */
public class A02_Stream02 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        hashMap.put("d", 4);
        hashMap.put("e", 5);

        hashMap.values().stream().forEach(element -> System.out.println(element));
        System.out.println("----");

        hashMap.keySet().stream().forEach(element -> System.out.println(element));
        System.out.println("----");

        hashMap.entrySet().stream().forEach((element -> System.out.println(element)));

    }
}
