package A08_MethodReference;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 方法引用三：引用成员方法
 * <p>
 * 格式：
 * 其他类：其他类对象::方法名
 * 本类：this::方法名(引用处不能是静态方法)
 * 父类：super::方法名(引用处不能是静态方法)
 * <p>
 * 需求：
 * 集合中有一些名字，按照要求过滤数据
 * 数据："张无忌","周芷若","赵敏","张强","张三丰"
 * 要求：只要以张开头，而且名字是3个字的
 */
public class MethodReference03 {
    public static void main(String[] args) {
        //create arraylist
        ArrayList<String> list = new ArrayList<>();

        //add data
        Collections.addAll(list, "张无忌","周芷若","赵敏","张强","张三丰");

        //使用Lambda表达式的filter方法
        list.stream()
                .filter(element -> element.startsWith("张") && element.length() == 3)
                .forEach(element -> System.out.println(element));

        //引用其他类成员方法
        //需要先创建对象
        StringOperation stringOperation = new StringOperation();
        list.stream()
                .filter(stringOperation::stringJudge)
                .forEach(element -> System.out.println(element));

        //引用本类成员方法
        //由于静态方法psvm没有this，在这里需要创建对象才能使用
        //在非静态方法中，可以直接this::方法名
        list.stream()
                .filter(new MethodReference03()::stringFilter)
                .forEach(element -> System.out.println(element));




    }

    public boolean stringFilter(String s){
        return s.startsWith("张") && s.length() == 3;
    }
}
