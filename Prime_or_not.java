import java.util.*;
public class Prime_or_not {
     static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if (isPrime(n))
            System.out.println(" true");
        else
            System.out.println(" false");
}
}