/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

    
import java.util.TreeSet;
import java.util.*;
public class NewClass11 {
    public static void main(String[] args) {
        TreeSet<Integer> tree1 = new TreeSet<Integer>();
        TreeSet<Integer> tree2 = new TreeSet<Integer>();
        for (int i = 100; i < 150; i++)
            if (i % 7 == 0)
                tree1.add(i);
        tree2 = (TreeSet) tree1.subSet(126, false, 134, true);
        tree1.add(176);
        System.out.println(tree1 + " " + tree2);
    }
}