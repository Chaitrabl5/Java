import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class NegPos {
    public static void mail(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String data=br.readLine();
        String[] numbers=data.split(" ");
        int[] array_nums=new int[Integer.parseInt(numbers[0])];
        int size=Integer.parseInt(numbers[0]);
        for(int i=0;i<size;i++){
            array_nums[i]=Integer.parseInt(numbers[i+1]);
        }
        int array[]=getNegativeFirst(array_nums);
        for (int i=0;i<size;i++){
            if(i<size-1)
            {
                System.out.print(array[i]+" ");
            }else{
                System.out.print(array[i]);
            }
        }
    }
    private static int[] getNegativeFirst(int[] array_nums){
         int j = 0, temp;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] < 0) {
                if (i != j) {
                    temp = array_nums[i];
                    array_nums[i] = array_nums[j];
                    array_nums[j] = temp;
                }
                j++;
            }
        }
        return array_nums;
    }
   }
