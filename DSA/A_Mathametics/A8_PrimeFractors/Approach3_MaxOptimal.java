package A_Mathametics.A8_PrimeFractors;

public class Approach3_MaxOptimal {
    public static void primeFactors(int n){
        if(n<=1) return;
        while(n%2==0){
            System.out.println(2);
            n/=2;
        }
        while(n%3==0){
            System.out.println(3);
            n/=3;
        }
        for (int i = 5; i*i <=n ; i+=6) {
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n/=(i+2);
            }
        }
        if(n>3) System.out.println(n);
    }

    public static void main(String[] args) {
        primeFactors(120);
    }
}
