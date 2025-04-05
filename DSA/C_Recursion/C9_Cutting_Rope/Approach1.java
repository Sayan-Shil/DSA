package C_Recursion.C9_Cutting_Rope;

public class Approach1 {

    public static int cuttingRope(int num, int a, int b, int c){
        if(num==0) return 0;
        if(num<0) return -1;

        int res = Math.max(
                cuttingRope(num - a, a, b, c),
                Math.max(
                        cuttingRope(num - b, a, b, c),
                        cuttingRope(num - c, a, b, c)
                )
        );

        if(res==-1) return -1;
        return res+1;

    }
    public static void main(String[] args) {
        System.out.println(cuttingRope(10,2,2,2));
    }
}
