package A_Mathametics.A11_Computing_Power;

public class Approach1_Naive {
    public static void Pow(int a, int b){
        if(b==0) {
            System.out.println("The Power of "+a+ " is : " +1);
            return;
        }
        int old_n = a;
        int new_n=a;
        for (int i = 1; i < b; i++) {
            new_n*=a;
        }
        System.out.println("The Power of "+old_n+ " is : " +new_n);
    }
    public static void main(String[] args) {
        Pow(5,6);
    }
}
