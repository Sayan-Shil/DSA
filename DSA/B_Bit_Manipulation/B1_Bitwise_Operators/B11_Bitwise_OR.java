package B_Bit_Manipulation.B1_Bitwise_Operators;

public class B11_Bitwise_OR {

    public static void OR(int a, int... b ){
        int result= a;
        for (int i = 0; i <b.length ; i++) {
           result= result | b[i] ;
        }

        System.out.println("The Result is -- "+result );
    }

    public static void main(String[] args) {
        OR(3,6);

    }
}
