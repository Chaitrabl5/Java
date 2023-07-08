package P1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class buff
{
	
	
	public static void main(String args[]) throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\004MBU744\\Desktop\\New folder java\\writer.txt");
//		int x =fr.read();
//		System.out.println((char)x); // casting
		BufferedReader br=new BufferedReader(fr);// casting is not needed when buffer class is used
		String s=br.readLine();
System.out.println(s);		
		
	}
}
