package A08_MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * 方法引用：类名引用成员方法
 * 格式：类名::成员方法
 * 需求：集合里面一些字符串，要求变成大写后进行输出
 *
 * 注意：
 * 不能引用类中的所有成员方法
 * 当被引用的成员方法是无参数方法时
 * 只能引用与抽象方法第一个参数同类型的类的方法
 */
public class MethodReference05 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "aaa","bbb","ccc");

        //把小写的英文字符串转换成大写
        list.stream()
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                })
                .forEach(element -> System.out.println(element));

        System.out.println("-------------------------------");

        //使用方法引用方式
        list.stream().map(String::toUpperCase).forEach(element -> System.out.println(element));
    }
}
