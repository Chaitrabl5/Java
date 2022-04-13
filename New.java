

/**
 *class and object
 * class--> blue print
 * object--> building
 */
class Calc
{
    int num1;//
    int num2;//instance variable
    int result;//
   public void perform()//public-->access modifier//void->return type//perform is method name//
            {
        result=num1+num2;//method//
    }
}
public class New {
    public static void main(String[] args)
    {
        Calc obj;//ref//object//
        obj=new Calc();//this is the real object --> knows something and does something//
        obj.num1=3;
        obj.num2=5;
        obj.perform();//is important to call method and print result//
        System.out.println(obj.result);
    }
    
}
