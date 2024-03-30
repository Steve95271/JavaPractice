package A13_Networking.ClientSentMultiToServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        method();
    }


    private  static void method() throws IOException {
        //TCP - 接收数据
        //创建ServerSocket对象用于接受数据
        ServerSocket serverSocket = new ServerSocket(9527);
        //监听客户端
        Socket socket = serverSocket.accept();
        //从连接通道获取输入流读取数据
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

        char[] bytes = new char[2048];
        int len;


        while ((len = inputStreamReader.read(bytes)) != -1) {
            System.out.println(String.valueOf(bytes, 0, len));
            outputStreamWriter.write("信息已收到");
            outputStreamWriter.flush();
        }

        inputStreamReader.close();
        outputStreamWriter.close();
        socket.close();
    }
}
