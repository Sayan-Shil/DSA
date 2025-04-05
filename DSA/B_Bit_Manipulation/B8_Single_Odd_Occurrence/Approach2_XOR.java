package B_Bit_Manipulation.B8_Single_Odd_Occurrence;

public class Approach2_XOR {
    public static int SingleOdd(int[] arr) {
       int result= arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1,2,2,1,5,5};
        System.out.println(SingleOdd(num));
    }
}
