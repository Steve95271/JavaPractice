package A11_IO.Practice;

import java.io.*;
import java.util.TreeSet;

/**
 * 把files文件夹下的出师表.txt的内容进行排序。
 *
 */
public class Practice05 {
    public static void main(String[] args) throws IOException {
        TreeSet<String> ts = new TreeSet<>();
        BufferedReader br = new BufferedReader(new FileReader("src/A11_IO/files/出师表.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            ts.add(line);
        }

        br.close();

        //注意，写出流不能在数据存入TreeSet之前开启。
        //因为写入写出流关联的文件是同一个，写出流关联文本后会清空文本内容
        BufferedWriter wr = new BufferedWriter(new FileWriter("src/A11_IO/files/出师表.txt"));

        for (String e : ts) {
            wr.write(e);
            wr.newLine();
        }

        wr.close();
    }
}
