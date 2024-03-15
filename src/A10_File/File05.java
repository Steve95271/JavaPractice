package A10_File;

import java.io.File;

public class File05 {
    /*
    测试printJavaFiles()方法
     */
    public static void main(String[] args) {
        File f1 = MyFileMethods.getDirectory();

        printJavaFile(f1);
    }

    public static void printJavaFile(File dir) {
        //获取当前路径下所有的文件和文件夹
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                if (file.getName().endsWith(".java")) {
                    System.out.println(file);
                }
            }

            //遇到的是文件夹时，递归调用自身，找到子文件夹的.java文件
            else {
                //这里做一个文件夹内容的非空判断，以防遇到空指针异常
                if (file.listFiles() != null){
                    printJavaFile(file);
                }
            }
        }
    }
}
