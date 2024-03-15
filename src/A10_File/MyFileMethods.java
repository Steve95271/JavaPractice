package A10_File;

import java.io.File;
import java.util.Scanner;

public class MyFileMethods {
    /**
     * 输入文件夹路径关联文件对象
     * @return 文件夹对象
     */
    public static File getDirectory() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Directory path: ");

            String path = scanner.nextLine();

            File directory = new File(path);

            if (!directory.exists()) {
                System.out.println("Directory not exists");
            } else if (directory.isFile()) {
                System.out.println("This path is a file");
            } else {
                return directory;
            }
        }
    }

    /**
     * Input一个文件夹，找到这个文件夹以及子文件夹下所有的.java文件
     * @param dir 输入一个文件夹
     */
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

    public static void deleteDir(File dir){

        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file);
                file.delete();
            } else {
                if (file.listFiles() != null){
                    deleteDir(file);
                }
            }
        }

        //循环结束后，文件夹被清空，再调用delete()方法删除空的文件夹。
        dir.delete();
    }
}
