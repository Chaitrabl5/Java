import java.io.*;
class NewClass26 {
    public static void main(String[] args) throws IOException {
        Except e = new Except();
        e.disp();
        Except1 e1 = new Except1();
        e1.disp();
        Trial t = new Trial();
        t.disp();
    }
}
class Except {
    public void disp() throws EOFException, FileNotFoundException {
        System.out.println("It is a super class");
    }
}
class Except1 extends Except {
    public void disp() throws FileNotFoundException {
        System.out.println("It is a sub class named except1");
    }
}
class Trial extends Except {
    public void disp() throws IOException {
//disp() in Trial cannot override disp() in Except
  //overridden method does not throw IOException
        System.out.println("It is a sub class named trial");
    }
}

    

