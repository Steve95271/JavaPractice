package A11_IO.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文件夹
 */
public class Practice04 {
    public static void main(String[] args) throws IOException{
        File srcFile = new File("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files/Test_folder");
        File disFile = new File("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A11_IO/files2");

        //先判断被复制的文件与目标路径是否相同。
        //如果相同，copyDirectory方法的递归会进入死循环。
        if (srcFile.equals(disFile)) {
            System.out.println("源文件夹与目标文件夹路径相同");
        } else {
            copyDirectory(srcFile, disFile);
        }
    }

    /**
     * 复制一个文件夹及其子文件夹到一个新的路径中。
     * @param src 源文件夹
     * @param dis 被复制文件的目标文件夹
     * @throws IOException
     */
    private static void copyDirectory(File src, File dis) throws IOException {
        //关联目标文件
        File newDir = new File(dis, src.getName());
        //创建文件夹
        newDir.mkdirs();

        File[] files = src.listFiles();


        for (File file : files) {
            if (file.isFile()){
                //关联输入的文件
                FileInputStream fileInputStream = new FileInputStream(file);

                //new File()在这里是拼接输出文件的pathname
                FileOutputStream fileOutputStream = new FileOutputStream(new File(newDir, file.getName()));

                byte[] fileBytes = new byte[1024];
                int len;

                while ((len = fileInputStream.read(fileBytes)) != -1) {
                    fileOutputStream.write(fileBytes, 0, len);
                }

                fileInputStream.close();
                fileOutputStream.close();
            } else {
                if (file.listFiles() != null) {
                    copyDirectory(file, newDir);
                }
            }
        }
    }


}
