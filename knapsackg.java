
package ada;

class d
{
    int i=0;
    d(int i)
    {
        this.i = i + 4;
    }
    void increment()
    {
         i = this.i + i;
    }
    void operate()
    {
        i *= 3;
    }
}

public class knapsackg {
     public static void main(String[] args)
             {
         d  a=new d(5);
         a.increment();
         a.operate();
         a = new d(a.i);
         a.operate();
         a.increment();
         System.out.println("i="+ a.i);
     }
}
