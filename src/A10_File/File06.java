package A10_File;

import java.io.File;

public class File06 {
    public static void main(String[] args) {
        File file = new File("/Users/fengyingcong/Desktop/day12");

        deleteDir(file);
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
