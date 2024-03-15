package A11_IO.B02_Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
    /*
        流对象使用完毕后需要关闭
     */

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/A11_IO/files/B.txt");

        fos.write("abc".getBytes());

        //调用close()方法关闭流
        fos.close();

        while (true){

        }
    }
}
