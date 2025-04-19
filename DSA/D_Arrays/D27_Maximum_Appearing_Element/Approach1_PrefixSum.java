package D_Arrays.D27_Maximum_Appearing_Element;

public class Approach1_PrefixSum {

    public static int Maximum(int[] left, int[] right) {
        int[] frag = new int[101];

        for (int i = 0; i < left.length; i++) {
            frag[left[i]]++;
                frag[right[i] + 1]--;
        }

        int max = frag[0];
        int result = 0;

        for (int i = 1; i < 101; i++) {
            frag[i] += frag[i - 1];
            if (frag[i] > max) {
                max = frag[i];
                result = i;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Maximum(new int[]{1,2,5,15}, new int[]{5,4,6,16}));
    }
}
