package A11_IO.B02_Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo01 {
    /*
        字节流输出数据

        构造方法：
        1. public FileOutputStream(String name): 输出流关联文件，文件路径以字符串形式给出
        2. public FileOutputStream(File file): 输出流关联文件，文件路径以File对象形式给出
     */

    public static void main(String[] args) throws IOException {
        //创建字节输出流对象，关联文件
        FileOutputStream fos = new FileOutputStream("src/A11_IO/files/A.txt");

        //写出数据
        fos.write(97);
        fos.write(98);
        fos.write(99);
    }
}
