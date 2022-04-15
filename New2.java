 //<<this>>//-->keyword
class C
{
    int num1;
    int num2;
    int result;
            
    public C(int num1,int num2)
    {
       this.num1=num1;//current object//
       this.num2=num2;
    }
}

//use of <"this"> is to differentiate between the instance and local variable//
public class New2 {
    public static void main(String[] args)
    {
        C obj=new C(4,5);
         System.out.println(obj.num1);
          System.out.println(obj.num2);
    }
}
