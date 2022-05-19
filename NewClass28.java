public class NewClass28 {
    public static void main(String args[]) {
        try {
            try {
                System.out.print("Print 0-");
                int b = 100 / 0;
            } catch (ArithmeticException e) {
                System.out.print("Catch 0-");
            }
            try {
                int a[] = new int[3];
                a[3] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("Catch 1-");
            }
            System.out.print("Printed 1-");
        } catch (Exception e) {
                System.out.print("Catch 2-");
        }
        System.out.print("Printed 2-");
    }

    
}
