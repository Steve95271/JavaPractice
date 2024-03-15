package A03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的第一种遍历方式。
 * 把Key获取出来放在Set集合中
 *
 */
public class MapDemo02 {
    public static void main(String[] args) {
        //创建Map集合的对象
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Cena");
        map.put(4, "David");

        //通过Key找Value
        //可以把所有的Key放在单列集合当中
        Set<Integer> keys = map.keySet();

        //遍历获得Key
        for (Integer key : keys) {
            String value = map.get(key);
            System.out.println(value);
        }
    }

}
