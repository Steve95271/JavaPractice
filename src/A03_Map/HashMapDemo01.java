package A03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        //Create HashMap object
        HashMap<Student, String> hashMap = new HashMap<>();

        //Create student objects
        Student zhangsan = new Student("Zhangsan", 24);
        Student lisi = new Student("lisi", 25);
        Student wangwu = new Student("wangwu", 26);

        //Put element to hashMap
        hashMap.put(zhangsan, "广东");
        hashMap.put(lisi, "广西");
        hashMap.put(wangwu, "海南");

        //Print the elements of hashMap
        Set<Student> keys = hashMap.keySet();
        for (Student key : keys){
            System.out.println(key + " = " + hashMap.get(key));
        }

        System.out.println("----------------------");

        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("-----------------------");

        hashMap.forEach((Student student, String provenance) -> {
            System.out.println(student + "=" + provenance);
        });

    }
}
