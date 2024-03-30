package A13_Networking.UploadFile;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //Create socket object
        Socket socket = new Socket("127.0.0.1", 9527);
        //Create File object bind to the file
        File file = new File("src/A13_Networking/UploadFile/ClientFile/000032.jpg");
        //Connect socket object as output stream target
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));

        //Define variable for record file byte
        int b;
        byte[] bytes = new byte[8192];
        int len;

        //read and write
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }

        //Close stream and socket
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();

    }

    private static void passFileNameToServer(String fileName, Socket socket) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        outputStreamWriter.write(fileName);
        outputStreamWriter.flush();
    }
}
