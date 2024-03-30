package A13_Networking.ClientSentMultiToServer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String serverAddr = "192.168.31.236";

    public static void main(String[] args) throws IOException {
        method();
    }

    private static void method() throws IOException {

        //Tcp协议-发送数据
        //创建Socket对象
        Socket socket = new Socket("127.0.0.1", 9527);
        //连接通道获取输出目标
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        //创建字符输入流用于接收服务端返回的信息
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        //键盘输入文本
        Scanner scanner = new Scanner(System.in);
        //存储读取到的输入流字节
        char[] chars = new char[2048];
        int len;

        while (true) {
            System.out.print("Enter text: ");
            String text = scanner.nextLine();
            //如果输入bye结束发送信息循环
            if (text.equals("bye")) {
                break;
            }
            outputStreamWriter.write(text);
            outputStreamWriter.flush();

            //由于使用TCP协议，连接建立之后数据流会保持读取，因此使用此方法可能不会读取到流的末端
            len = inputStreamReader.read(chars);
            System.out.println("Number of characters: " + len);
            System.out.println(String.valueOf(chars, 0, len));

        }

        //释放资源
        outputStreamWriter.close();
        socket.close();
    }
}
