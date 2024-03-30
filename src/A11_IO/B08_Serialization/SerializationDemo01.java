package A11_IO.B08_Serialization;

import java.io.*;


public class SerializationDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writeObject();

        readObject();
    }


    private static void writeObject() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/A11_IO/files/F.txt"));

        Student alice = new Student("Alice", 19);

        oos.writeObject(alice);
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/A11_IO/files/F.txt"));

        Object o = ois.readObject();

        System.out.println(o);
    }
}
