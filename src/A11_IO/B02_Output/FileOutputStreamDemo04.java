package A11_IO.B02_Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {
    /*
        JDK7之后的版本处理IO输出流异常的方式
     */

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("src/A11_IO/files/B.txt")) {
            fos.write("Hello world".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
