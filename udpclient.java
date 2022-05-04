
package javaapplication13;

import java.net.*;
import java.io.*;
public class udpclient {
    public static void main(String[] args) throws Exception{
        byte sbuf[]=new byte[1024];
         byte rbuf[]=new byte[1024];
        BufferedReader fromuser=new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket socket=new DatagramSocket();
        String addr1="127.0.01";
        InetAddress addr=InetAddress.getByName(addr1);
        System.out.println("enter an integer");
        String data=fromuser.readLine();
        sbuf=data.getBytes();
        DatagramPacket spkt=new DatagramPacket(sbuf,sbuf.length,addr,6000);
        socket.send(spkt);
        System.out.printf(" sent to server"+data);
        DatagramPacket rpkt=new DatagramPacket(rbuf,rbuf.length);
        socket.receive(rpkt);
        data=new String(rpkt.getData(),0,rpkt.getLength());
        System.out.printf("factorial of integer received from server is "+data);
        socket.close();
    }
}
