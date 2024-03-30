package A13_Networking.UploadFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server2 {
    public static void main(String[] args) throws IOException {
        //Create ServerSocket with port bind
        ServerSocket serverSocketFileName = new ServerSocket(9527);
        ServerSocket serverSocketFileData = new ServerSocket(9528);

        //Listening the client
        Socket socketFileName = serverSocketFileName.accept();
        Socket socketFileData = serverSocketFileData.accept();

        //Get file name first
        String fileName = getFileName(socketFileName);
        //Close the file name transfer socket
        socketFileName.close();

        //Replace file name by UUID
        String uuid = UUID.randomUUID().toString();
        String expandedName = fileName.substring(fileName.lastIndexOf("."));
        String filenameWithUUID = uuid + expandedName;

        //InputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socketFileData.getInputStream());
        //OutputStream
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A13_Networking/UploadFile/ServerFile/" + filenameWithUUID));

        //read and write file
        int b;
        while ((b = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(b);
        }


        bufferedInputStream.close();
        bufferedOutputStream.close();
        socketFileData.close();

    }

    private static String getFileName(Socket socket) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        char[] chars = new char[8192];
        int len;
        len = inputStreamReader.read(chars);
        inputStreamReader.close();
        if (len == -1) return null;
        return String.valueOf(chars, 0, len);
    }
}
