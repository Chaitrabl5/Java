
package javaapplication13;
import java.util.Scanner;
import java.util.Arrays;
public class rsa {
    public static void main(String[] args){
        int p,q,n,z,e,k=1,i;
        int in[]=new int[10];
        int ci[]=new int[10];
        Scanner t=new Scanner(System.in);
        System.out.println("enter prime numbers");
        p=t.nextInt();
        q=t.nextInt();
        n=p*q;
        z=(p-1)*(q-1);
        do{
            System.out.println("enter the random number between 3 and z");
            e=t.nextInt();
        }while((gcd(z,e)==0)&&(e<z-1));
        System.out.printf("public key pair{%d,%d}",e,n);
        for(k=1;((k*e)%z)!=1;k++)
        {
            
        }
        System.out.printf("public key pair {%d,%d}",k,n);
        System.out.println("enter the message in decimal");
        for(i=0;i<1;i++)
            in[i]=t.nextInt();
         for(i=0;i<1;i++)
             ci[i]=encrypt(in[i],e,n);
         System.out.printf("cipher text is:");
          for(i=0;i<1;i++)
              System.out.printf("%d:",ci[i]);
          System.out.println("plain text is:");
           for(i=0;i<1;i++)
               System.out.printf("%d",encrypt(ci[i],k,n));
    }
    static int encrypt(int m,int e,int n)
    {
        int k=1,i;
        for(i=1;i<=e;i++)
        {
            k=(k*m)%n;
        }
        return k;
    }
    static int gcd(int z,int e)
    {
        int k;
        while(true){
            k=z%e;
            z=e;
            e=k;
        if(k==1)
            return 1;
        else if(k==0)
            return 0;
        }
    }
}
