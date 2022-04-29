
package javaapplication8;
import java.io.*;

public class Try_catch {

    public static void main(String[] args) {
        java.io.BufferedReader stdin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));  
        String input = new String();  
        try {			
	      int intVal = Integer.parseInt(stdin.readLine());
	        Double doubleVal = Double.parseDouble(stdin.readLine());
	        String strVal = stdin.readLine();
	        
	        System.out.println("String: "+strVal);
	        System.out.println("Double: "+doubleVal);
	        System.out.println("Int: "+intVal);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
}
    

