package C_Recursion.C11_Tower_Of_Hanoi;

public class Solution {
    public static void TowerOfHanoi(int n, char A , char B, char C){
        if(n==1) {
            System.out.println("Move 1 from " +A+ " to "+C);
            return;
        }
        TowerOfHanoi(n-1,A,C,B);
        System.out.println("Move "+n+ " from " +A+ " to "+C);
        TowerOfHanoi(n-1,B,A,C);
    }

    public static void main(String[] args) {
        TowerOfHanoi(6,'A','B','C');
    }
}
