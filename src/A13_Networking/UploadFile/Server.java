package A13_Networking.UploadFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //Create ServerSocket with port bind
        ServerSocket serverSocket = new ServerSocket(9527);
        //Listening the client
        Socket socket = serverSocket.accept();
        //InputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        //OutputStream
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A13_Networking/UploadFile/ServerFile/A.jpg"));

        //read and write file
        int b;
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.close();

    }

    private static String getFileName(Socket socket) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        char[] chars = new char[8192];
        int len;
        len = inputStreamReader.read(chars);
        if (len == -1) return null;
        return String.valueOf(chars, 0, len);
    }
}
