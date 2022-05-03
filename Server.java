
package javaapplication9lab;


//9th program
   import java.io.*; 
import java.net.*; 
public class Server {
 public static void main(String args[]) throws Exception { 
    // create a server socket at port 6789 
  ServerSocket socket = new ServerSocket(6789); 
  System.out.println(" Server is Listening on port 6789"); 
   
  //wait for incoming connection 
  Socket serverEnd = socket.accept(); 
  System.out.println(" Request accepted"); 
   
  //get streams 
  BufferedReader fromClient = new BufferedReader(new InputStreamReader(serverEnd.getInputStream())); 
  PrintWriter toClient = new PrintWriter(serverEnd.getOutputStream(), true); 
   
  //recieve data from client 
  int n = Integer.parseInt(fromClient.readLine()); 
  System.out.println("Recieved from Client:" + n); 
  int fact =1; 
  for(int i = 2; i<=n; i++) 
   fact *=i; 
    //send result to the client 
  toClient.println(fact); 
  System.out.println("Sent to Client:" + fact); 
    } 
} 
 

