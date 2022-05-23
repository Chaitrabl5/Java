public class NewClass35{
    public static void main(String[] args) {
        CounterClass thread1 = new CounterClass(); // LINE A
        thread1.run();
    }
}
class CounterClass extends Thread {
    Thread t = new Thread();
  
    public void run() {
        System.out.println("Thread entered.");
        try {
            t.wait();
        } catch (Exception e) {
            System.out.println("Thread Interrupted.");
        }
        System.out.println("Thread exiting.");
    }

   }
