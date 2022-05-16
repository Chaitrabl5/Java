/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.lang.Runnable;
class Test implements Runnable {
public void run()
    {
        System.out.println("Run");
    }
} class Myclass {
public static void main(String[] args)
    {
        Thread t1 = new Thread();
        t1.start();
        System.out.println("Main");
    }
}


