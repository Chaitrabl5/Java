
public class NewClass18 {
 
    static void findTheLeaders(int inputArray[]){
        int inputArrayLength = inputArray.length;
        int max = inputArray[inputArrayLength-1];
        System.out.print(inputArray[inputArrayLength-1]+ " ");
        for (int i = inputArray.length-2; i >= 0; i--) {
            if(inputArray[i] > max) {
                System.out.println(inputArray[i]);
                max = inputArray[i];
            }
        }
    }
    public static void main(String[] args)
    {
        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
 }
}

