package A11_IO.B01_Input;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileInputStreamDemo01 {
    /*
        字节流读取数据
     */

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/A11_IO/files/A.txt");

        int i;
        ArrayList<Integer> bytes = new ArrayList<>();

        //在while循环中先进行赋值
        //只要i不等于-1，说明读取到了内容
        while((i = fis.read()) != -1) {

            bytes.add(i);

        }

        //关闭流
        fis.close();

        bytes.forEach(b -> System.out.println((char)((int)b)));
    }
}
