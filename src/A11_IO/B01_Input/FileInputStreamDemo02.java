package A11_IO.B01_Input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/A11_IO/files/IMG_3539.HEIC");

        byte[] bytes = new byte[8192];

        /*
            bytes数组读取到的是字节内容
            i被赋值的是读取到的个数
         */
//        int i = fis.read(bytes);

        //想要打印内容需要用Arrays.toString()
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(i);

        /*
            由于文本长度只有三个字符，第二次读取时只读取到一个字符。
            数组[1]的位置会依然是上次读取时的数据
         */
//        i = fis.read(bytes);
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(i);

        /*
            使用String的构造方法把字节转换成字符串。
            以下的方法可以避免读取残留数据
         */

        int len; //len会获取读取到字符的个数
        int count = 0;

        while((len = fis.read(bytes)) != -1) {
            //String s = new String(bytes, 0, len); //转换的字节从0索引到len索引
            //System.out.println(s);
            count ++;
        }

        fis.close();

        System.out.println(count);
    }
}
