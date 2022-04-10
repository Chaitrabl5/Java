/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class dandcmerge 
{
    public static int n;
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        Random r=new Random();
        System.out.println("enter the number of input,where n=5000" );
        n=in.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=r.nextInt(5000);
        int low=0;
        int high=x.length-1;
        System.out.println("elements before sorting");
        System.out.println(Arrays.toString(x));
        long startTime=System.currentTimeMillis();
        mergesort(x,low,high);
        long stopTime=System.currentTimeMillis();
        long elapsedTime=stopTime-startTime;
        System.out.println("elements after sorting");
        System.out.println(Arrays.toString(x));
        System.out.println("time taken to sort"+n+"numbers"+elapsedTime+"milliseconds");
        
        
    }
    public static void merge(int a[],int low,int mid,int high)
    {
        int i,j,k;
        i=low;
        j=mid+1;
        k=low;
        int b[]=new int[n];
        while((i<=mid)&&(j<=high))
        {
            if(a[i]<a[j])
            {
                b[k]=a[i];
                k=k+1;
                i=i+1;
            }
            else
            {
                b[k]=a[j];
                k=k+1;
                j=j+1;
             }
        }
        while(i<=mid)
        {
            b[k]=a[i];
            k=k+1;
            i=i+1;
        }
        while(j<=high)
        {
            b[k]=a[j];
            k=k+1;
            j=j+1;
        }
        for(i=low;i<=k-1;i++)
            a[i]=b[i];
    }
    public static void mergesort(int a[],int low,int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
            
        }
    }
}
