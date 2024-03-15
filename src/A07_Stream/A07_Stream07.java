package A07_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;

/**
 * Stream流的终结方法
 * forEach(), count(), toArrau()
 */
public class A07_Stream07 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "Alice", "Alice", "Alice", "Bob", "Celin", "David", "Eason", "Franco");

        //count 方法
        long count = list1.stream().count();
        System.out.println(count);

        //toArray()
        Object[] array = list1.stream().toArray();

        //toArray()方法指定数组类型
        String[] array2 = list1.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        String[] array3 = list1.stream().toArray(value -> new String[value]);
    }
}
