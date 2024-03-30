package A13_Networking.UploadFile;

import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        //Create socket object
        Socket sendFileNameSocket = new Socket("127.0.0.1", 9527);
        Socket sendFileDataSocket = new Socket("127.0.0.1", 9528);

        //Create File object bind to the file
        File file = new File("src/A13_Networking/UploadFile/ClientFile/000024.jpg");

        //Pass file name to server first
        passFileNameToServer(file.getName(), sendFileNameSocket);
        //Close file name transfer socket
        sendFileNameSocket.close();


        //Connect socket object as output stream target
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(sendFileDataSocket.getOutputStream());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));


        //read and write
        int b;
        while ((b = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(b);
        }

        //Close stream and socket
        bufferedInputStream.close();
        bufferedOutputStream.close();
        sendFileDataSocket.close();

    }

    private static void passFileNameToServer(String fileName, Socket socket) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        outputStreamWriter.write(fileName);
        outputStreamWriter.close();
    }
}
