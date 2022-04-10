
package ada;
import java.io.*;

public class Newstar {
    public static void io(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>1;j--)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n=5;
        io(n);
    }
}
