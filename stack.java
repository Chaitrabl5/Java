
package ada;
import java.util.Scanner;

public class stack {
    private static final int capacity=5;
    int s[]=new int[capacity];//to create 1d array
    int top=-1;
    public void push()
    {
        if(top<capacity-1)
        {
            Scanner sc=new Scanner(System.in);//to create an object for an class scanner
            System.out.println("enter the elements to be inserted");
            int num=sc.nextInt();//to enter the numbers
            top++;
            s[top]=num;
            System.out.println("the element"+num+"is inserted into the stack");
            
            
        }
        else
            System.out.println("stack overflow");
    }
    public void pop()
    {
        if(top>=0)
        {
            System.out.println("the deleted element is"+s[top]);
            top--;
            
        }
        else
            System.out.println("stack underflow");
    }
    public void display()
    {
        if(top>=0)
        {
            System.out.println("the elements of the stack are");
            for(int i=0;i<=top;i++)
                System.out.println(s[i]);
        }
        else
            
            System.out.println("stack underflow");
    }
    public static void main(String[]args)
    {
        stack st=new stack();//to create an object for  class stack
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("stack operations");
            System.out.println("enter ur choice 1.push 2.pop 3.display 4.exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:st.push();
                             break;
                case 2:st.pop();
                            break;
                case 3:st.display();
                           break;
                case 4:return;         
            }
        }
    }
}
