
package ada;
import java.util.Scanner;
import java.util.StringTokenizer;
class customer
{
    private String name,date_of_birth;
    void readdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        name=sc.next();
        System.out.println("enter the date of birth in format dd/mm/yyyy");
        date_of_birth=sc.next();
    }
    void display()
    {
        
        String[] msg=new String[3];
        StringTokenizer st=new StringTokenizer(date_of_birth,"/");
        System.out.println("the details of the customer are as follows");
        System.out.print("<name,dd,mm,yyyy>");
        for( int i=0;i< 3 ;i++)
            msg[i]=st.nextToken();
        System.out.println("<" +name+","+msg[0]+","+msg[1]+","+msg[2]+">");
    }
}

public class prog2b {
    public static void main(String[]args)
    {
        customer c=new customer();
        c.readdata();
        c.display();
    }
    
}
