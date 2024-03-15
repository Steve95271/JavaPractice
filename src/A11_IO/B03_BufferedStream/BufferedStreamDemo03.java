package A11_IO.B03_BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo03 {
    /*
        字节缓冲输出流的写出数据过程

        细节：
        字节缓冲流会创建一个长度为8192的byte类型数组。
        当一个数组被填满时才会写出数据。
        如果未填满，则需要使用close()方法借宿流才会写出。
     */

    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files2/A.txt"));

        for (int i = 1; i <= 100; i++) {
            bos.write(97);
        }

        bos.close();
    }
}
