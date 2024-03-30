package A13_Networking.UploadFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server3 {
    public static void main(String[] args) throws IOException {
        //Create ServerSocket with port bind
        ServerSocket serverSocketFileName = new ServerSocket(9527);
        ServerSocket serverSocketFileData = new ServerSocket(9528);

        //Create Thread Pool
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                6, //core thread
                24, //Max thread
                60, //idle time
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), //Waiting queue
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        while (true) {
            //Listening the client
            Socket socketFileName = serverSocketFileName.accept();
            Socket socketFileData = serverSocketFileData.accept();

            //new Thread(new StoreFileRunnable(socketFileName, socketFileData)).start();
            threadPoolExecutor.submit(new StoreFileRunnable(socketFileName, socketFileData));
        }

    }

}
