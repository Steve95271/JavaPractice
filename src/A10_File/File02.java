package A10_File;

import java.io.File;
import java.io.IOException;

public class File02 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A10_File/abc.txt");
        System.out.println(file1.createNewFile());

        File file2 = new File("src/A10_File/Directory1/Sub_Directory");
        System.out.println(file2.mkdirs());

        file2.deleteOnExit();

        File file3 = new File("src/A10_File", "Directory1");

        System.out.println(file3.exists());
    }
}
