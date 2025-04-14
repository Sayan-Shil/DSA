package A_Basics;

public class Basics {
    public static void print(int[] num){
        System.out.print("{");
        for (int i = 0; i <num.length ; i++) {
            if(i== num.length-1){
                System.out.print(num[i]);
            }
            else {
                System.out.print(num[i]+",");
            }
        }
        System.out.print("}");
    }
    public static void Swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
    }

}
