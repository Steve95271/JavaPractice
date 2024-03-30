package A11_IO.B08_Serialization;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {

    //手动定义固定的序列ID可以让本类的变量或者方法修改后避免发生序列号不匹配异常。
    @Serial
    private static final long serialVersionUID = 9527L;

    private String name;
    private int age;

    /*
        transient关键字：
            可以让变量不参与序列化
     */
    private transient int[] arr;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "-" + age;
    }
}
