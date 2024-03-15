package A03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo04 {
    public static void main(String[] args) {
        Map<String, String > map = new HashMap<>();

        map.put("鲁迅", "这句话是我说的");
        map.put("曹操", "吾好梦中杀人");
        map.put("刘备", "接着奏乐接着舞");
        map.put("柯镇恶", "看我眼色行事");

        //利用lambda表达式进行遍历。
        //这是匿名内部类的方式。
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " : " + s2);
            }
        });

        System.out.println("---------------------");

        //这是最简化的lambda表达式的遍历方式。
        //由于参数有两个Key和Value，因此需要把两个参数括起来。
        //如果只有一个参数，则不需要使用括号。
        map.forEach((String key, String value) -> {
            System.out.println(key + " = " + value);
        });
    }
}
