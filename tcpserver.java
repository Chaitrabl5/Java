
package javaapplication13;

import java.net.*;
import java.io.*;
public class tcpserver {
    public static void main(String[] args) throws Exception
    {
        ServerSocket socket=new ServerSocket(6789);
        System.out.println("server ready");
        Socket serverEnd=socket.accept();
        System.out.println("request accepted");
        BufferedReader fromclient=new BufferedReader(new InputStreamReader(serverEnd.getInputStream()));
        PrintWriter toClient = new PrintWriter(serverEnd.getOutputStream(), true); 
         int n = Integer.parseInt(fromclient.readLine()); 
      System.out.println("Recieved from Client:" + n); 
      int fact =1; 
      for(int i = 1; i<=n; i++) 
     fact *=i; 
  toClient.println(fact); 
  System.out.println("Sent to Client:" + fact); 
    }
}
