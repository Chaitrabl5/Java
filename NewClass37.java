import java.util.*;
import java.util.HashSet;
import java.util.ArrayList;

public class NewClass37 {

    public static void main(String[] args) {
        List<A> l = new ArrayList<A>();
        l.add(new A(5, 4));
        l.add(l.get(0));
        l.add(new A(6, 0));
        l.add(new A(5, 4));
        l.add(new A(6));
        Set<A> s = new HashSet<A>();
        s.addAll(l);
        System.out.print("l = " + l.size() + " s = " + s.size());
    }
}

class A {
    int i, j;
    public A(int i, int j) { this.i = i; this.j = j; }
    public A(int i) { this.i = i; }

    
}
