
package javaapplication13;
import java.net.*;
import java.io.*;

public class tcpclient {
     public static void main(String[] args) throws Exception
    {
        Socket clientEnd=new Socket("127.0.01",6789);
        System.out.println("client ready");
   BufferedReader fromserver=new BufferedReader(new InputStreamReader(clientEnd.getInputStream()));
        PrintWriter toserver = new PrintWriter(clientEnd.getOutputStream(), true); 
         BufferedReader fromuser=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter integer");
        String n=fromuser.readLine();
        toserver.println(n);
         System.out.println("sent to server"+n);
        String fact=fromserver.readLine();
         System.out.println("received from server"+fact);
         clientEnd.close();
}
}