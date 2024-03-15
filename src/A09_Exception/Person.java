package A09_Exception;

import A09_Exception.MyException.AgeOutOfBoundsException;
import A09_Exception.MyException.NameFormatException;

public class Person {
    private String name;
    private int age;

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        int nameLength = name.length();
        if (nameLength < 3 || nameLength > 10){
            throw new NameFormatException(name + "，名字长度超出范围");

        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40){
            throw new AgeOutOfBoundsException(age + "，年龄超出范围");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
