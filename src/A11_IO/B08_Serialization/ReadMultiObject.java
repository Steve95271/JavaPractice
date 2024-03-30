package A11_IO.B08_Serialization;

import java.io.*;
import java.util.ArrayList;

/**
 * 演示使用循环进行多个对象的读取。
 * 注意：
 *  与普通文件读取到末端获得返回值不一样。
 */
public class ReadMultiObject {
    private static final String path = "src/A11_IO/files/G.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //fun();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));

        ArrayList<Object> objects = new ArrayList<>();

        try {
            //序列化流读取对象时，文件的对象已全部读取完时只会抛出异常
            //因此在这里使用while (true)进行读取，遇到异常时会中断循环
            while (true) {
                Object object = objectInputStream.readObject();
                objects.add(object);
            }
        } catch (EOFException e) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }

        System.out.println("Hey");



    }

    /**
     * 序列化流写出对象
     * @throws IOException
     */
    private static void fun() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));

        Student s1 = new Student("Alice", 19);
        Student s2 = new Student("Bob", 20);
        Student s3 = new Student("Celin", 21);

        objectOutputStream.writeObject(s1);
        objectOutputStream.writeObject(s2);
        objectOutputStream.writeObject(s3);

        objectOutputStream.close();
    }
}
