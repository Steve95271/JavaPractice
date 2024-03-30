package A11_IO.B08_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/A11_IO/files/F.txt"));

        Student alice = new Student("Alice", 19);

        oos.writeObject(alice);

        oos.close();
    }
}
