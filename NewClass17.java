
import java.util.Arrays;
public class NewClass17 {
   
    static void var1(int var[]) {
        int counter = 0;
        for (int i = 0; i < var.length; i++) {
            if(var[i] != 0) {
                var[counter] = var[i];
                counter++;
            }
        }
        while (counter < var.length) {
            var[counter] = 0;
            counter++;
        }
        System.out.println(Arrays.toString(var));
    }
    public static void main(String[] args)
    {
        var1(new int[] {12, 0, 7, 0, 8, 0, 3});
    }
}

