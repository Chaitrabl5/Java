public class NewClass33 {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.run();
        Example e = new Example();
        t = new Thread(e);
        t.run();
    }
}
class Example implements Runnable {
    public void run() {
        System.out.println("Thread Running");
    }

    }
