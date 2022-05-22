public class NewClass32 {
    public static void main(String[] args) {
        Thread t = new Thread(new Example());
        t.run();
    }
}
class Example implements Runnable {
    public void run() {
        System.out.println("Thread Running");
    }

    
}
