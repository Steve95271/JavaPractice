package TreeSet;

import java.util.TreeSet;

public class TreeSetPractice01 {
    public static void main(String[] args) {
        /*
        需求：创建5个学生对象
        属性：(姓名,年龄，语文成绩,数学成绩,英语成绩),
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英文成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一个学生，不存。

        第一种：默认排序/自然排序
        第二种：比较器排序

        默认情况下，用第一种排序方式，如果第一种不能满足当前的需求，采取第二种方式。
         */

        //1.创建学生对象
        Student zhangsan = new Student("zhangsan", 23, 98, 99, 50);
        Student lisi = new Student("lisi", 24, 90, 98, 50);
        Student wangwu = new Student("wangwu", 25, 95, 100, 30);
        Student zhaoliu = new Student("zhaoliu", 26, 60, 99, 70);
        Student qianqi = new Student("qianqi", 26, 70, 80, 70);

        //2.创建集合
        //TreeSet存入的对象是唯一的，同时它也能排序
        TreeSet<Student> studentTreeSet = new TreeSet<>();

        //3.添加元素
        studentTreeSet.add(zhangsan);
        studentTreeSet.add(lisi);
        studentTreeSet.add(wangwu);
        studentTreeSet.add(zhaoliu);
        studentTreeSet.add(qianqi);

        //4.打印集合
        for (Student printingObject : studentTreeSet) {
            System.out.println(printingObject);
        }
    }
}
