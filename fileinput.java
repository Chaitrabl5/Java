package P1;




import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class fileinput {
	
	public static void main(String args[]) throws IOException
	{
	FileOutputStream obj=new FileOutputStream("C:\\Users\\004MBU744\\Desktop\\New folder java\\writer.txt");
	String s="new data";
	byte b[]=s.getBytes();
	obj.write(b);
		
		
//	FileInputStream obj1=new FileInputStream("D:\\sample.txt");
//	BufferedInputStream obj=new BufferedInputStream(obj1);
//	
//	System.out.println((char)obj.read());
//	System.out.println((char)obj.read());
//	System.out.println((char)obj.read());
//	System.out.println((char)obj.read());
	}
}
