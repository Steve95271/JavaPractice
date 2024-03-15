package A10_File;

import java.io.File;

/**
 * 找文件夹
 */
public class File03 {
    public static void main(String[] args) {
        File directory = MyFileMethods.getDirectory();

        System.out.println(directory);
    }
}
