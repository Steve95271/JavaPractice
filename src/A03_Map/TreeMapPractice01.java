package A03_Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapPractice01 {
    public static void main(String[] args) {

        //重写compare方法改变元素在TreeMap中的顺序。
        //重写后是根据Key的倒序排序
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        treeMap.put(1001, "iPhone15Pro");
        treeMap.put(1002, "MacBook Pro");
        treeMap.put(1003, "Sony TV");
        treeMap.put(1004, "Projector");
        treeMap.put(1005, "Latte");

        System.out.println(treeMap);
    }
}
