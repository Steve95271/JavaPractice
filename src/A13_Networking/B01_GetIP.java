package A13_Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class B01_GetIP {
    public static void main(String[] args) throws UnknownHostException {
        //Get ip address
        InetAddress address = InetAddress.getByName("192.168.31.156");

        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }
}
