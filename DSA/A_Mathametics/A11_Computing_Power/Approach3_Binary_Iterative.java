package A_Mathametics.A11_Computing_Power;

public class Approach3_Binary_Iterative {
    public static int Pow(int a, int b){
        int res=1;
        while(b>0){
            if(b%2!=0){
                res*=a;
            }
            a*=a;
            b/=2;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println((long)Pow(5,5));
    }
}
