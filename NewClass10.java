import java.util.*;

public class NewClass10 {

    static String s;

    public NewClass10(String s) {

        NewClass10.s = s;

    }

    public static void main(String[] args) {

        HashSet<Object> hs = new HashSet<Object>();

        NewClass10 ws1 = new NewClass10("pranavi");

        NewClass10 ws2 = new NewClass10("madhavi");

        String s1 = new String("jahnavi");

        String s2 = new String("vyshnavi");

        String s3 = new String("vyshnavi");

        hs.add(ws1);

        hs.add(ws2);

        hs.add(s1);

        hs.add(s2);

        hs.add(s3);

        System.out.println(hs.size());

    }

}

