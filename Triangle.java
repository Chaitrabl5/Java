
package ada;

import java.util.Scanner;


public class Triangle {
     int base,height;
    void getArea(){
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base and height of triangle");
         base=sc.nextInt();
         height=sc.nextInt();
        area=(base*height)/2;
         System.out.print("area" +area);
    }
        public static void main(String[] args){
               int base,height;
            Triangle t1=new Triangle();
            
          
        t1.getArea();
       
    }
            
      
}
