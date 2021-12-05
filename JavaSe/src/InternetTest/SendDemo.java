package InternetTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class SendDemo {
    public static void main(String[] args) throws IOException {

        //发射器
        DatagramSocket sender = new DatagramSocket();
        //导弹
        byte[] data = "第一次尝试网络编程".getBytes(StandardCharsets.UTF_8);
        DatagramPacket send_packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.31.207"), 10086);
        //发射
        sender.send(send_packet);
        //熄火
        sender.close();



    }
}
