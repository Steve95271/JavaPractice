package A11_IO.B02_Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
    /*
        IO流的异常处理方式（JDK7以前的处理方法）
     */

    public static void main(String[] args) {

        FileOutputStream fos = null;

        try {
            int i = 10/0; //算数运算异常
            fos = new FileOutputStream("src/A11_IO/files/B.txt");
            fos.write("Java".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
            finally关键字的作用：
            以防try代码块抛出未处理的异常导致程序终止。
            程序始终会执行finally代码块中的代码。
         */
        finally {
            //先做非空判断，如果本身是null，则无需要关闭流
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
