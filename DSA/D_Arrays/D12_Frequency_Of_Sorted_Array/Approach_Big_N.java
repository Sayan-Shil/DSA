package D_Arrays.D12_Frequency_Of_Sorted_Array;

import java.util.Arrays;

public class Approach_Big_N {
    public static void Frequency(int[] arr){
        int value=arr[0];
        int count= 0;

        for (int i = 1; i < arr.length ; i++) {
            count++;
            if(arr[i]!=arr[i-1]){
                System.out.println(value + ": "+count);
                count=0;
                value=arr[i];
            }
        }
        System.out.println(value + ": "+ ++count);
    }
    public static void main(String[] args) {
        int[] result= new int[100];
        for (int i = 0; i < 100; i++) {
            result[i] = (int)(Math.random() * 6);
        }
        Arrays.sort(result);
        Frequency(result);
    }
}
