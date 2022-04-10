
package ada;
import java.util.Scanner;

public class palindrome 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter "+n+"array elements");
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.println("\nthe elements in this array are" );
      for(int i=0;i<n;i++)
      {
          System.out.println(arr[i]);
      }
      for(int i=0;i<n;i++)
      {
          int rev=0,rem,temp;
          temp=arr[i];
          while(arr[i]!=0)
          {
              rem=arr[i]%10;
              rev=rev*10+rem;
              arr[i]=arr[i]/10;
          }
          if(rev==temp)
              System.out.println(temp+"is palindrome");
          else
              System.out.println(temp+"is not palindrome");
      }
    }
    
}
