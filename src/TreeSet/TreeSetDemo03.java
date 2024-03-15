package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet重写排序方式的例子。
 * 代码演示了在TreeSet中重写Compare方法。
 * 实现了先按照字符串长度进行排序，如果字符串长度一致，则按照首字母进行排序。
 */
public class TreeSetDemo03 {
    public static void main(String[] args) {
        /*
            需求：自行选择比较器排序和自然排序两种方式
            要求：存入四个字符串，"c", "ab", "df", "qwer"
            按照长度排序，如果一样则按照首字母排序
        */

        //1.创建集合
        TreeSet<String> stringTreeSet = new TreeSet<>(new Comparator<String>() {

            //o1: 当前要添加的元素
            //o2: 已经在红黑树存在的元素
            //返回值:
            @Override
            public int compare(String o1, String o2) {
                //先按照长度排序
                int stringLength = o1.length() - o2.length();
                //长度一样按照首字母排序
                stringLength = stringLength == 0 ? o1.compareTo(o2) : stringLength;
                return stringLength;
            }

        });

        //2.添加元素
        stringTreeSet.add("c");
        stringTreeSet.add("ab");
        stringTreeSet.add("df");
        stringTreeSet.add("qwer");

        //3.打印TreeSet
        System.out.println(stringTreeSet);
    }


}
