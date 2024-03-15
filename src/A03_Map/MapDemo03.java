package A03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的第二种遍历方式
 * 通过获得所有的Entry进行遍历
 */
public class MapDemo03 {
    public static void main(String[] args) {
        //创建Map集合的对象
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Cena");
        map.put(4, "David");

        //获得Entry的Set集合
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        //遍历
        for (Map.Entry<Integer,String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
