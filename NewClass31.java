public class ThreadQuestion {
    public static void main(String[] args) {
        Thread t = new Thread();    ///      no parameter is passed so error see the next example
        t.run();
    }
}
class Example implements Runnable {
    public void run() {
        System.out.println("Thread Running");
    }
}