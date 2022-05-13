/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

  import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
public class NewClass9
{
    public static void main(String rgs[])
    {
        List<String> list = new ArrayList<String>();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");
        list.add(" ");
        list.add("P");
        list.add("R");
        list.add("O");
        list.add("G");
        list.add("R");
        list.add("A");
        list.add("M");
        list.add("M");
        list.add("I");
        list.add("N");
        list.add("G");
       System.out.print(list);
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<String>(list);
        System.out.print(list);
    }
}
