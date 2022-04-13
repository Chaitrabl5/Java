

//constructor//
/*
member method
same name as class name
it will never return anything
to allocate memory
*/
class A
{
    int i;
    float f;//instance variable//
    //there will be a default constructor//
    public A()//
    {
        i=5;
        f=5.5f;
         System.out.println("hi");
    }                                                                          // constructor overloading//
    public A(int k)//local variable//
    {
        i=k;
         System.out.println("hello");//
    }
    public A(int k,float j)
    {
         System.out.println("result");
    }
}

public class New1 {
    public static void main(String[] args)//string-->string accept all the values(int.float....)//we don't know how many values so we take array(args)
                                                                                  //static because main is the starting point of the execution as we cannot call the the object without main//
    {
          A  obj=new A(6,5.5f)   ;                                                //new provides memory allocated by constructor//
    }
}
