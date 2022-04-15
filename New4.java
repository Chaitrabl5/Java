class Casi//constructor overloading
{
    int num1;
    int num2;
    String operation;

    public Casi()
    {
        num1=0;
        num2=0;
        operation="nothing";
                 System.out.println("hi");
    }
    public Casi(int i)
    {
        num1=i;
        num2=0;
        operation="nothing";
               System.out.println("chi");
    }
    public Casi(int j,int g)
    {
        num1=j;
        num2=g;
         operation="nothing";
                 System.out.println("good ");
    }
     public Casi(int j,int g,String op)
    {
        num1=j;
        num2=g;
         operation=op;
                 System.out.println("morning");
}
}
    
public class New4 {
    public static void main(String[] args)
    {
        Casi obj=new Casi(4,5);
       
    }
}
