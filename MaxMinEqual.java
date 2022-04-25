import java.util.Scanner;
public class MaxMinEqual {
    
    public void isMaxMinEqual(int array[])
    {
    int maxcount = 0;
    int mincount = 0;
    int largest = array[0];

    for (int i = 0; i < array.length; i++) {

        if (array[i] > largest) {
            largest = array[i];
        }
        if (array[i] == largest) {
            maxcount = maxcount + 1;
        }

    }
    int smallest = array[0];

    for (int j = 0; j < array.length; j++) {

        if (array[j] < smallest) {
            smallest = array[j];
        }
        if (array[j] == smallest) {
            mincount = mincount + 1;
        }

    }
    if (maxcount == mincount) 
     {
        System.out.print("TRUE");
    }
        else{
    System.out.println("FALSE");
}
    }
    
    
    public static void main(String[] args)
    {
        MaxMinEqual obj =new MaxMinEqual();
        Scanner in=new Scanner(System.in);
        String data=in.nextLine();
        String[] numbers=data.split(" ");
        int size = Integer.parseInt(numbers[0]);
        int[] nums=new int[size];
        
        for (int i=1;i<size+1; i++)
        {
            nums[i-1]=Integer.parseInt(numbers[i]);
        }
        obj.isMaxMinEqual(nums);

    }
}