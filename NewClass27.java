/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */class Fruit {
    public void eat() throws Exception {
        System.out.println("Eating fruit");
    }
}
public class NewClass27 extends Fruit {
    public void eat() {
        System.out.println("Eating apple");
    }
    public static void main(String[] args) throws Exception {
        Fruit f = new NewClass27();
        f.eat();
    }
}

    

