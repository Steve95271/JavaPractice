package A11_IO.Practice;

import java.io.*;
import java.util.ArrayList;

public class Practice06 {

    public static void main(String[] args) throws IOException {
        //write();
        read();
    }

    private static void write() throws IOException {
        Student zhangsan = new Student("张三", 23);
        Student lisi = new Student("李四", 24);
        Student wangwu = new Student("王五", 25);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(zhangsan);
        studentList.add(lisi);
        studentList.add(wangwu);

        BufferedWriter wr = new BufferedWriter(new FileWriter("src/A11_IO/files/Student.txt"));

        for (Student student : studentList) {
            wr.write(student.toString());
            wr.newLine();
        }

        wr.close();
    }

    private static void read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/A11_IO/files/Student.txt"));

        String line;

        ArrayList<Student> students = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            String[] nameAndAge = line.split("-");
            students.add(new Student(nameAndAge[0], Integer.parseInt(nameAndAge[1])));
        }

        br.close();

        for (Student student : students) {
            System.out.println(student);
        }
    }

}
