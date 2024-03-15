package A11_IO.B04_FileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * 使用FileReader读取纯文本文件避免乱码
 */
public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //readCharacterOneByOne();

        FileReader fileReader = new FileReader("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/A.txt");

        char[] chars = new char[1024];

        //记录读取到字符的长度
        int len;

        while ((len = fileReader.read(chars)) != -1) {

            String s = new String(chars, 0, len);

            System.out.println(s);
        }

    }

    private static void readCharacterOneByOne() throws IOException {
        FileReader fileReader = new FileReader("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/A.txt");

        int character;

        while((character = fileReader.read()) != -1) {
            System.out.println((char) character);
        }
    }


}
