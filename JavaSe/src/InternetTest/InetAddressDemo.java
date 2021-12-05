package InternetTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress my_address = InetAddress.getByName("192.168.31.207");
        String name = my_address.getHostName();
        System.out.println(name);
    }
}
