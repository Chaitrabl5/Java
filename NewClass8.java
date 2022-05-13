import java.util.TreeSet;
public class NewClass8 {

    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add("Roots");
        tree.add("Stem");
        tree.add("Branchs");
        TreeSet newtree = (TreeSet) tree.clone();
        newtree.add("Leaves");
        System.out.println(newtree);
    }
}