package A10_File;

import java.io.File;
import java.io.IOException;

/**
 * File类的构造方法：
 * public File (String pathname): 根据传入的字符串路径封装file对象
 * public File (String parent, String chile): 根据传入的父级路径和子级路径来封装file对象
 * public File (File parent, String child): 根据传入的父级路径(File类型)和子级路径来封装File对象
 */
public class File01 {
    public static void main(String[] args) throws IOException {
        /*
        使用构造方法创建file对象是使对象与文件路径产生关联
        注意：
        即使文件不存在于此路径上，程序运行也不会报错。
         */
        File file1 = new File("/Users/fengyingcong/Desktop/Java/A.txt");

        //文件不存在可以使用createNewFile()方法创建
        file1.createNewFile();



    }
}
