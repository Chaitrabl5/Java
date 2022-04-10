
package ada;

import java.util.Scanner;
public class dividebyzero {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of a nb");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try
        {
            int c=a/b;
            System.out.println("c="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("arithmetic exception divide by zero");
            e.printStackTrace();
        }
    }
}
