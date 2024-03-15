package A11_IO.B07_OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 写出文件时也可以指定编码。
 * 在这个演示中，给出了追加文本的写出方法。
 */
public class OutputStreamWriterDemo01 {
    public static void main(String[] args) throws IOException {

        //在FileOutputStream的构造方法中第二个参数添加true能够进行文本追加
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/A11_IO/files/E.txt", true), "GB18030");

        String string = "龙年发发发";

        osw.write(string);

        osw.close();
    }
}
