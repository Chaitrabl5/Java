class Casio
{
    public  void add(int i,int j)//method over loading//
    {
         System.out.println(i+j);
    }
     public  void add(int i,int j,int k)
    {
         System.out.println(i+j+k);
    }
     public  void add(double i,double j)
    {
         System.out.println(i+j);
    }
    
 }
public class New3 {
    public static void main(String[] args)
    {
        Casio obj=new Casio();
        obj.add(4, 5);
        
        obj.add(4, 5,6);
        
        obj.add(4.5, 6.7);
    }
}

        
        
        
        
        
        
        
        
        
        
        
    
    

