package A13_Networking.UploadFile;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class StoreFileRunnable implements Runnable{
    private Socket receiveFileNameSocket;
    private Socket receiveFileDataSocket;

    public StoreFileRunnable(Socket receiveFileNameSocket, Socket receiveFileDataSocket) {
        this.receiveFileNameSocket = receiveFileNameSocket;
        this.receiveFileDataSocket = receiveFileDataSocket;
    }

    @Override
    public void run() {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            //Get file name first
            String fileName = getFileName(receiveFileNameSocket);
            //Close the file name transfer socket
            receiveFileNameSocket.close();

            //Replace file name by UUID
            String uuid = UUID.randomUUID().toString();
            String expandedName = fileName.substring(fileName.lastIndexOf("."));
            String filenameWithUUID = uuid + expandedName;

            //InputStream
            bufferedInputStream = new BufferedInputStream(receiveFileDataSocket.getInputStream());
            //OutputStream
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/fengyingcong/IdeaProjects/JavaPractice/src/A13_Networking/UploadFile/ServerFile/" + filenameWithUUID));

            //read and write file
            int b;
            while ((b = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(b);
            }
            bufferedOutputStream.close();

            //Response message back to client
            OutputStreamWriter osWriter = new OutputStreamWriter(receiveFileDataSocket.getOutputStream());
            osWriter.write("上传成功");
            osWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (receiveFileDataSocket != null) {
                try {
                    receiveFileDataSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



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
