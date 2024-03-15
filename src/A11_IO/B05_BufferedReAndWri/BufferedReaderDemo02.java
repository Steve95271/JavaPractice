package A11_IO.B05_BufferedReAndWri;

import java.io.*;

/**
 * 字符缓冲流方法演示2:
 * 使用readLine()方法进行循环读取，返回值为String
 * 注意：
 *  使用循环进行readLine()方法读取文本时遇到下一行的文字不会自动换行，需要使用newLine()方法进行换行。
 */
public class BufferedReaderDemo02 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/B.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/A11_IO/Files2/B.txt"));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            //在循环中，写出完一行文本后不会自动换行，需要使用一下方法进行换行
            bufferedWriter. newLine();
        }

        //每次完成读写都要调用关闭流方法，否则数据不会写出
        bufferedReader.close();
        bufferedWriter.close();
    }

}
