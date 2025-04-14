package D_Arrays.D13_Best_time_to_Buy_Sell;

public class Approach2_Graph_Efficient {

    public static int BestTimeToBuyAndSell(int[] arr){
       int profit=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>arr[i-1]){
                profit += arr[i]-arr[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        System.out.println(BestTimeToBuyAndSell(new int[]{10,20,30}));
    }
}
