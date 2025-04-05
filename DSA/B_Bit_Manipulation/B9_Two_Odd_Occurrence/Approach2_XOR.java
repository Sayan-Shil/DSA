package B_Bit_Manipulation.B9_Two_Odd_Occurrence;

import java.util.HashSet;

public class Approach2_XOR {
    public static HashSet<Integer> SingleOdd(int[] arr) {
        HashSet<Integer> hm = new HashSet<>();

        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        int mask = result & (~(result-1));
        int p=0,q=0;
        for (int i = 0; i <arr.length ; i++) {
            if((arr[i]&mask)==0) p= p ^ arr[i];
            else q= q ^ arr[i];
        }
        hm.add(p);
        hm.add(q);

        return hm;

    }

    public static void main(String[] args) {
        int[] num = {1,2,2,2,1,5,5,5};
        for (int n : SingleOdd(num)) {
            System.out.println(n);
        }

    }
}
