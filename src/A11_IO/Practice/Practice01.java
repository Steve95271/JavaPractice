package A11_IO.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice01 {
    /*
        复制一张图片到files2
     */
    public static void main(String[] args) throws IOException {
        //File file = new File("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/IMG_3539.HEIC");
        FileInputStream fis = new FileInputStream("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/IMG_3539.HEIC");
        FileOutputStream fos = new FileOutputStream("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files2/IMG_3539.HEIC");

        //long length = file.length();

        byte[] bytes = new byte[1024];
        int len;

        //循环读取字节到bytes数组当中
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        //关闭流
        fis.close();
        fos.close();
    }
}
