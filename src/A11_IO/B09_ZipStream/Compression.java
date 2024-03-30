package A11_IO.B09_ZipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Compression {
    public static void main(String[] args) throws Exception {

/*        File src = new File("src/A11_IO/files2/Test_ZipStream");

        File destParent = src.getParentFile();

        File dest = new File(destParent,src.getName() + ".zip");

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));*/

        //compress(src, zos, src.getName());
        Path source = Paths.get("src/A11_IO/files2/Test_ZipStream");
        Path zipPath = Paths.get("src/A11_IO/files2/Test_ZipStream.zip");

        File sourceFile = source.toFile();

        System.out.println(sourceFile.getPath());

        zipFolder(source, zipPath);

    }

    public static void compress(File src, ZipOutputStream zos, String pathname) {

        File[] files = src.listFiles();

        for (File file : files) {
            if (file.isFile()) {

                ZipEntry entry = new ZipEntry(pathname + file.getName());

                System.out.println(entry.getName());

            }else {
                compress(file, zos, file.getName());
            }
        }

    }

    private static void zipFolder(Path sourceFolderPath, Path zipPath) throws Exception {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath.toFile()));
        Files.walkFileTree(sourceFolderPath, new SimpleFileVisitor<Path>() {
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                zos.putNextEntry(new ZipEntry(sourceFolderPath.relativize(file).toString()));
                Files.copy(file, zos);
                zos.closeEntry();
                return FileVisitResult.CONTINUE;
            }
        });
        zos.close();
    }
}
