package A11_IO.B08_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/A11_IO/files/F.txt"));

        Object o = ois.readObject();

        ois.close();

        System.out.println(o);
    }
}
