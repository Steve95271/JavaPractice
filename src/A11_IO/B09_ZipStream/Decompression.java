package A11_IO.B09_ZipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 解压文件
 *
 */
public class Decompression {
    public static void main(String[] args) throws IOException {
        File dest = new File("src/A11_IO/files2");


        ZipInputStream zis = new ZipInputStream(new FileInputStream("src/A11_IO/files2/Test_ZipStream.zip"));

        ZipEntry zipEntry;


        while ((zipEntry = zis.getNextEntry()) != null) {

            if (zipEntry.isDirectory()) {
                File file = new File(dest, zipEntry.toString());
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, zipEntry.getName()));
                int b;
                while((b = zis.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();
            }
        }

        zis.close();
    }
}
