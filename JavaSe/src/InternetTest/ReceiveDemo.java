package InternetTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //靶 子
        DatagramSocket receiver = new DatagramSocket(10086);
        //空包
        byte[] data = new byte[1000];
        DatagramPacket receive_packet =new DatagramPacket(data,data.length);
        //接收
        receiver.receive(receive_packet);
        //熄火
        receiver.close();


        //展 示
        String result = new String(receive_packet.getData(),0,receive_packet.getLength());
        System.out.println(result);
    }
}
