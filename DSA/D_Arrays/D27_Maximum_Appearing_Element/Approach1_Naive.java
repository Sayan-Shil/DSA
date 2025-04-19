package D_Arrays.D27_Maximum_Appearing_Element;

public class Approach1_Naive {

    public static int Maximum(int[] left, int[] right){
        int frag[] = new int[100];

        for (int i = 0; i < left.length; i++) {
            for (int j = left[i]; j <=right[i] ; j++) {
                frag[j]++;
            }
        }
        int max = frag[0];
        int result = 0;

        for (int i = 1; i < 100; i++) {
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
