//Java program to print the sum of n natural numbers
import java.util.Scanner;
public class sum_of_n_natural_numbers
{	
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		
		//input from user
		System.out.print("Enter a number : ");				
		int n = sc.nextInt();
		//declare a variable to store sum
		int sum=(n*(n+1))/2;
		
		//display the sum
		System.out.print("Sum of n natural numbers is "+sum);
	
		sc.close();													
	}
}