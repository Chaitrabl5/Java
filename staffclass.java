
package ada;
import  java.util.Scanner;//to include class scanner

 class staff {
private String name,phno,staffid;
private float salary;

public staff(String a,String b,String c,float d)
{
    name=a;
    phno=b;
    staffid=c;
    salary=d;
}
public String toString()
{
    return "staff[name="+name+",phno="+phno+",staffid="+staffid+"salary="+salary+"]";
}         
}
class technical extends staff
{
    private String skills;
    public technical(String a,String b,String c,float d,String e)
    {
        super(a,b,c,d);
        skills=e;
    }
    public String toString()
    {
        return "technical[super="+super.toString()+"skills="+skills+"]";
    }
            
    }

class teaching extends staff
{
    private String domain;
    private int publication;
    public teaching(String a,String b,String c,float d,String e,int f)
    {
        super(a,b,c,d);
        domain=e;
        publication=f;
    }

  public String toString()
{

                return "technical[super="+super.toString()+"domain="+domain+"publication="+publication+"]";
}
}         
    class contract extends staff
    {
        private int period;
        public contract(String a,String b,String c,float d,int e)
        {
            super(a,b,c,d);
            period=e;
        }
        public String toString()
{

                return "contract[super="+super.toString()+"period="+period+"]";
}
    }



public class staffclass
{
    
public static void main(String[] args) {
        technical b[ ]=new technical[3];
        teaching c[ ]=new teaching[3];
        contract d[ ]=new contract[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the type of staff 1.technical 2.teaching 3.contract");
        int ch=sc.nextInt();
        switch(ch)
                {
            case 1:System.out.println("enter the details of technical staff");
                          for(int i=0;i<3;i++)
                          {
                              System.out.println("enter the name");
                              String name1=sc.next();
                              System.out.println("enter the staffid");
                              String staffid1=sc.next();
                              System.out.println("enter the phone number");
                              String phno1=sc.next();
                              System.out.println("enter the salary");
                              float salary1=sc.nextFloat();
                              System.out.println("enter the skills");
                              String skills1=sc.next();
                              b[i]=new technical(name1,staffid1,phno1,salary1,skills1);
                          }
        System.out.println("the details of technical  staff are");
        for(int i=0;i<3;i++)
            System.out.println(b[i]);
        break;
            case 2:System.out.println("enter the details of teaching staff");
                          for(int i=0;i<3;i++)
                          {
                              System.out.println("enter the name");
                              String name1=sc.next();
                              System.out.println("enter the staffid");
                              String staffid1=sc.next();
                              System.out.println("enter the phone number");
                              String phno1=sc.next();
                              System.out.println("enter the salary");
                              float salary1=sc.nextFloat();
                              System.out.println("enter the domain");
                              String domain1=sc.next();
                                System.out.println("enter the publication");
                              int publication1=sc.nextInt();
                              c[i]=new teaching(name1,staffid1,phno1,salary1,domain1,publication1);
                          }
        System.out.println("the details of teaching  staff are");
        for(int i=0;i<3;i++)
            System.out.println(c[i]);
        break;
        
         case 3:System.out.println("enter the details of contract staff");
                          for(int i=0;i<3;i++)
                          {
                              System.out.println("enter the name");
                              String name1=sc.next();
                              System.out.println("enter the staffid");
                              String staffid1=sc.next();
                              System.out.println("enter the phone number");
                              String phno1=sc.next();
                              System.out.println("enter the salary");
                              float salary1=sc.nextFloat();
                              System.out.println("enter the period");
                              int period1=sc.nextInt();
                              d[i]=new contract(name1,staffid1,phno1,salary1,period1);
                          }
        System.out.println("the details of contract staff are");
        for(int i=0;i<3;i++)
            System.out.println(d[i]);
        break;
        
        
 }
}
}
