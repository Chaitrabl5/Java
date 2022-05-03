
package javaapplication9lab;

//9th program
    import java.io.*; 
import java.net.*; 
public class Client {
 public static void main(String argv[]) throws Exception { 
  String fact; 
   //create a socket to the server 
  Socket clientEnd = new Socket("127.10.0.1",6789); 
  System.out.println("Connected to Localhost at port 6789"); 
    //get streams 
  PrintWriter toServer = new PrintWriter(clientEnd.getOutputStream(), true); 
  BufferedReader  fromServer = new BufferedReader (new InputStreamReader (clientEnd.getInputStream())); 
  BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in)); 
   
  //get an integer from user 
  System.out.println("Enter an integer"); 
  String n = fromUser.readLine(); 
   
  //send it to server 
  toServer.println(n); 
  System.out.println(" Sent to Server: " + n); 
   
  //retrieve result 
  fact = fromServer.readLine(); 
  System.out.println(" Recieved from server: " + fact); 
     //close the socket 
  clientEnd.close(); 
 } 
 } 
 


