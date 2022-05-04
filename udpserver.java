
package javaapplication13;

import java.net.*;
import java.io.*;
public class udpserver {
    public static void main(String[] args) throws Exception {
         byte sbuf[]=new byte[1024];
         byte rbuf[]=new byte[1024];
         DatagramSocket socket=new DatagramSocket(6000);
         System.out.println("server is ready");
         DatagramPacket rpkt=new DatagramPacket(rbuf,rbuf.length);
         socket.receive(rpkt);
         String data=new String(rpkt.getData(),0,rpkt.getLength());
         InetAddress addr=rpkt.getAddress();
         int port=rpkt.getPort();
         int fact=1,n=Integer.parseInt(data);
         System.out.printf("received "+data+"from"+addr+":"+port);
         for(int i=1;i<=n;i++)
             fact*=i;
         sbuf=String.valueOf(fact).getBytes();
         DatagramPacket spkt=new DatagramPacket(sbuf,sbuf.length,addr,port);
         socket.send(spkt);
         System.out.println("sent to client is"+fact);
    }
}
