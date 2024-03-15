package A11_IO.B05_BufferedReAndWri;


import java.io.*;


/**
 * 字符缓冲流的基本使用
 *
 * 注意：
 *  字符缓冲流本身不具备读写功能，它只是对普通流对象进行包装
 */
public class BufferedReaderDemo01 {

    public static void main(String[] args) throws IOException {

        //singleCharWay();
        arrayCharWay();

    }

    private static void singleCharWay() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/B.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/A11_IO/Files2/B.txt"));

        int i;

        while ((i = bufferedReader.read()) != -1) {
            bufferedWriter.write(i);
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static void arrayCharWay() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/B.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/A11_IO/Files2/B.txt"));

        char[] chars = new char[8192];

        int len;

        while ((len = bufferedReader.read(chars)) != -1 ){
            bufferedWriter.write(len);
        }

        bufferedReader.close();
        bufferedWriter.close();

    }

}
