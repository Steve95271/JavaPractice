package A10_File;

import java.io.File;

public class File04 {
    /*
    File类的遍历方法：
        public File[] listFiles() 获取当前目录下所有的“一级文件对象”返回File数组
     */

    public static void main(String[] args) {
        File file = new File("src/A10_File");

        File[] files = file.listFiles();

        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
