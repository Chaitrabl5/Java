
package javaapplication13;
import java.util.Scanner;
import java.util.Arrays;
public class crc {
    public static void main(String[] args)
    {
    String r=null;
 String i=null;
 System.out.println(" Enter the message in Binary ");
 Scanner t=new Scanner(System.in);
 i=t.nextLine();
crc(i,1);
System.out.println(" Enter the recieved message ");
 r=t.nextLine();
try{
    if(crc(r,0)==1)
        System.out.println("error free message");
}
catch(Exception e){
    System.out.println(" error in received message");
}
    }
    static int crc(String p,int mode)
    {
         int j,k;
 String poly="10000100000010001";

 String zero="0000000000000000";

 char output[]=new char[p.length()];
 char input[]=new char[p.length()];
 char g[]=new char[poly.length()];
String res;
 String out=null;
 out=p;
 g=poly.toCharArray();
 if(mode==1)
     out=out+zero;
 output=out.toCharArray();
  for(j=0;j<input.length;j++)
 if(output[j]=='1')
 for(k=0;k<g.length;k++)

if((output[j+k]=='1'&&g[k]=='1')||(output[j+k]=='0'&&g[k]=='0'))
 output[j+k]='0';
 else
 output[j+k]='1';
 
 for(j=0;j<output.length;j++)
 {
 if(output[j]=='1')
 {
 break;
 }
 }
 res=new String(output);
if(mode==1)
    System.out.print("crc  code"+p+""+res.substring(output.length-zero.length(),output.length));
return 1;
    }
}

 
