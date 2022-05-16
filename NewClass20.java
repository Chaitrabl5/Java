
class est extends Thread {
public void run()
    {
        System.out.println("Run");
    }
} class NewClass20  {
public static void main(String[] args)
    {
        est t = new est();
       t.start();
        System.out.println("Main");
    }
}

    

