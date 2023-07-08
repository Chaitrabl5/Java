package P1;
import java.io.FileWriter;
import java.io.IOException;
public class writerExample {
public static void main(String args[])throws IOException {
	FileWriter fw=new FileWriter("C:\\Users\\004MBU744\\Desktop\\New folder java\\writer.txt",true);
	//char c=(char)fw.read();read() reads as unicode ,so it is casted to character 
	fw.write("hello world");
	fw.close();
}
}


//import java.io.FileWriter;
//import java.io.IOException;
//public class writerExample
//{
//// writer class , how to write the data in text file
//	
//	
//	public static void main(String args[]) throws IOException
//	{
//	FileWriter fw=new FileWriter("D:\\ibm_june.txt",true);
//	fw.write("hello world");
//	fw.close();
//	}
//}
// true will apend the data