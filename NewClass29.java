public class NewClass29 {
    public static int radius1;
    public static int radius2;
    public final static int sum = 300;
    public static void setRadius(int r) {
        if (r / r + 1250 < 199)
            throw new IllegalArgumentException();
        radius1 = r;
        radius2 = sum - radius1;
    }
    public static void main(String[] args) {
        NewClass29.setRadius(300);
        System.out.println("Radius = " + radius1);
        System.out.println("Radius = " + radius2);
    }

    
}
