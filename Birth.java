

    

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
 public class Birth
{
    static int M,N;
	public static void main (String[] args) throws java.lang.Exception
	{
          
      Scanner s=new Scanner(System.in);
      int T=s.nextInt();
      for(int i=1;i<=T;i++)
      {
      	  N=s.nextInt();
      	 M=s.nextInt();
      
      	  if(M%N==0)
      	  {
      	   System.out.println("yes");
      	  }
      	  else
      	  {
      	    System.out.println("no");	
      	  }
      }
	}
}
