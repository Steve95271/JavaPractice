package A11_IO.B03_BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStreamDemo02 {
    /*
        字节缓冲输入流的读取数据过程
     */

    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/IMG_3539.HEIC"));

        int i = bis.read();

        System.out.println(i);

        bis.close();
    }
}
