
class Employee{
  private String name, address;
  private int  year;
  public Employee(String n, int y,  String add){
    name = n;
    year = y;
    address = add;
  }
  public String Name(){
    return name;
  }
  public int Year(){
    return year;
  }
  public String Address(){
    return address;
  }
}

class Emp{
  public static void main(String[] args){
    Employee e1 = new Employee("Robert", 1994,  "64C- WallsStreet");
    Employee e2 = new Employee("Sam", 2000,  "68d- WallsStreet");
    Employee e3 = new Employee("John", 1999, "26B- WallsStreet");
    System.out.println("Name\tYear of joining\tAddress");
    System.out.println(e1.Name()+"\t"+e1.Year()+"\t"+e1.Address());  
    System.out.println(e2.Name()+"\t"+e2.Year()+"\t"+e2.Address());  
    System.out.println(e3.Name()+"\t"+e3.Year()+"\t"+e3.Address());  
  }
}
    

