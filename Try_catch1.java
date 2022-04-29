
package javaapplication8;
import java.io.*;

public class Try_catch1 {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s1 = br.readLine();
            String s2 = br.readLine();
            String s3 = br.readLine();
            System.out.println("String: " + s3);
            System.out.println("Double: " + Double.parseDouble(s2));
            System.out.println("Int: " + Integer.parseInt(s1));
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


    

