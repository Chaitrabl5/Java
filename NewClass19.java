/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.Arrays;
public class NewClass19 {

    private static void var(int[] inputArray, int n) {
        int temp;        
        for (int i = 0; i < n; i++) {
            temp = inputArray[0];            
            for (int j = 0; j < inputArray.length-1; j++) {
                inputArray[j] = inputArray[j+1];
            }            
            inputArray[inputArray.length - 1] = temp;
        }     
        System.out.println(Arrays.toString(inputArray));
    }    
    public static void main(String[] args)
    {
        var(new int[] {1,2,3,4,5,6,7}, 2);
    }
}
