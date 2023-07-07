package P1;

public class string {
public static void main(String args[])
{
	String s="WELCOME TO INDIA";
	s=s.toLowerCase();
	System.out.print(s);
	StringBuffer sb=new StringBuffer("hello");
	sb.append("world");
	 System.out.println(sb);
	 StringBuilder sb1=new StringBuilder("welcome to");
		sb1.append("ibm");
		 System.out.println(sb1);
		 int x[]=new int[3];
		 x[0]=12;
		 x[1]=13;
		 x[2]=33;
		 for (int i=0;i<x.length;i++){
		 System.out.println(x[i]);
		 }
		 int y[]= {2,3,3};
		 for (int i=0;i<y.length;i++){
			 System.out.println(y[i]);
			 }
		 int y1[][]=new int[3][3];
		 //y1= {{2,3,4},{5,6,7},{1,4,8}};
		 for (int i=0;i<y1.length;i++) {
			 for (int j=0;j<y1.length;j++) {
				 System.out.println(y1[i][j]);
			 }
		 }
		 
		 
}
}
