import java.util.HashSet;

public class  NewClass38
{
    public static void main(String Str[])
    {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        System.out.print(hashSet);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("E");
        subSet.add("B");
        subSet.add("A");
        subSet.add("F");
        hashSet.retainAll(subSet);
        System.out.print(subSet);
    }

    
}
