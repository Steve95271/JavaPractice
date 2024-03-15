package A07_Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A08_Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "张无忌-男-15", "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        //把所有男性收集到List集合中
        List<String> maleList = list.stream()
                .filter(element -> "男".equals(element.split("-")[1]))
                .collect(Collectors.toList());

        System.out.println(maleList);

        System.out.println("----------------------");

        //把所有男性收集到Set集合中
        Set<String> maleSet = list.stream()
                .filter(element -> "男".equals(element.split("-")[1]))
                .collect(Collectors.toSet());

        System.out.println(maleSet);

        System.out.println("------------------------");

        /*
        把所有男性收集到Map集合中
        注意：
        使用Collectors.toMap()方法时需要参数有两个
        参数一：返回key
        参数二：返回value
        Map集合中key不能重复
         */
        Map<String, Integer> maleMap = list.stream()
                .filter(element -> "男".equals(element.split("-")[1]))
                .collect(Collectors.toMap(
                        new Function<String, String>() {
                            @Override
                            public String apply(String s) {
                                return s.split("-")[0];
                            }
                        },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));

        //Lambda表达式写法
        Map<String, Integer> maleMap2 = list.stream()
                .filter(element -> "男".equals(element.split("-")[1]))
                .collect(Collectors.toMap(
                        element -> element.split("-")[0],
                        element -> Integer.parseInt(element.split("-")[2])
                ));

    }
}
