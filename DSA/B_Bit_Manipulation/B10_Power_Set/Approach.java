package B_Bit_Manipulation.B10_Power_Set;

public class Approach {
    public static void powerSet(String s){
        int horizontal = s.length();
        int vertical = 1<<horizontal;

        for (int i = 0; i <vertical ; i++) {
            for (int j = 0; j < horizontal; j++) {
                if((i&(1<<j))!=0) System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        powerSet("abcdefg");
    }
}
