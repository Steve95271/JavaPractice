package A11_IO.B06_InputStreamReader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader
 * 能够读取不同编码的纯文本文件
 * 需要在构造方法中指定编码
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/A11_IO/files/E.txt"), "GB18030");

        int readCharacter;

        while ((readCharacter = isr.read()) != -1) {
            System.out.println((char) readCharacter);
        }

        isr.close();
    }
}
