package A11_IO.B08_Serialization;

import java.io.*;
import java.util.ArrayList;

/**
 * 当使用集合封装好对象后，序列化流写出和写入多个对象只需执行方法一次
 */
public class ReadMultiObject02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/A11_IO/files/H.txt"));

        ArrayList<Student> students = (ArrayList<Student>) objectInputStream.readObject();

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void write() throws IOException {
        Student s1 = new Student("Alice", 19);
        Student s2 = new Student("Bob", 20);
        Student s3 = new Student("Celin", 21);

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/A11_IO/files/H.txt"));

        objectOutputStream.writeObject(studentList);
    }
}
