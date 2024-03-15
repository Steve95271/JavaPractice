package A11_IO.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 图片加密解密
 * 对输入流字节进行exclusive or运算（异或运算）
 */
public class Practice02 {
    public static void main(String[] args) throws IOException {
        encodePicture1();
    }

    private static void encodePicture1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/A11_IO/files2/IMG_1852.jpg");

        ArrayList<Integer> bytes = new ArrayList<>();

        int b;

        while((b = fileInputStream.read()) != -1) {
            bytes.add(b);
        }

        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream("src/A11_IO/files2/IMG_1852.jpg");

        for (Integer outByte : bytes) {
            Integer temp = outByte ^ 2;
            fileOutputStream.write(temp);
        }

        fileOutputStream.close();
    }

    /**
     * 此方法无法加密
     * @throws IOException
     */
    private static void encodePicture2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/A11_IO/files2/IMG_1852.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("src/A11_IO/files2/IMG_1852.jpg");

        byte[] bytesArray = new byte[8192];
        byte encodedByte;
        int temp;

        while (fileInputStream.read(bytesArray) != -1) {
            fileOutputStream.write(bytesArray);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

}
