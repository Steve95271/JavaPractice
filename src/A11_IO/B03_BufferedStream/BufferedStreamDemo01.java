package A11_IO.B03_BufferedStream;

import java.io.*;

public class BufferedStreamDemo01 {

    /*
        字节缓冲流在源代码中内置了字节数组，可以提高读写效率
     */

    public static void main(String[] args) throws IOException {
        //创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/A.txt"));

        //创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/A11_IO/files2/A.txt"));

        //读写
        int i;
        while ((i = bis.read()) != -1) {
            bos.write(i);
        }

        //关闭流
        bis.close();
        bos.close();


    }
}
