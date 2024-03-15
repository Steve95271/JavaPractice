package A11_IO.B04_FileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Java默认的字符-字节编解码方式是UTF-8。
 * UTF-8 是unicode的一种。
 * 在UTF-8的编解码中，中文会占用3个字节，第一个字节一定会是负数。
 * Java在对字节转换字符的解码中，会先判断第一个字符，如果是负数则认为是中文
 */
public class FileReaderDemo2 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/A.txt");

        int i;

        while ((i = fileReader.read()) != -1) {
            System.out.println((char) i);
        }

        fileReader.close();
    }
}
