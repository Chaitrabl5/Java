import java.util.*;
import java.io.*;
import java.lang.Math;
public class LuckyDraw {
public static int luckyDraw(int number){
int temp = number, count = 0;   
while (temp > 0)   
{  
count++;  
temp = temp / 10;  
}  
int[] num = new int[count];  
int total=0;
while (number > 0)  
{  
num[count-- - 1] = number % 10;  
number = number / 10;  
}  
while (findsNextpermutation(num))   
{  
  for (int i = 0; i < num.length; i++)  {
System.out.println(num[i]);
total++;
}
}  
return total;
}  
 public static boolean findsNextpermutation(int[] p)   
{  
for (int a = p.length - 2; a >= 0; --a)  
if (p[a] < p[a + 1])  
for (int b = p.length - 1;; --b)  
if (p[b] > p[a])   
{  

int t = p[a];  
p[a] = p[b];  
p[b] = t;  
for (++a, b = p.length - 1; a < b; ++a, --b)  
{  

t = p[a];  
p[a] = p[b];  
p[b] = t;  
}  
return true;  
}  
return false;  
}  
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.close();
         System.out.print(luckyDraw(x)) ;  
    }
}
