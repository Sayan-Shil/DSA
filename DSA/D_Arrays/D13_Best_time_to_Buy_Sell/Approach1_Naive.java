package D_Arrays.D13_Best_time_to_Buy_Sell;

public class Approach1_Naive {
    public static int BestTimeToBuyAndSell(int[] arr){
        return BestTime(arr,0,0,true);
    }

    private static int BestTime(int[] arr, int length,int profit, boolean checkForBuy) {
        if(length==arr.length) return profit;

        if(checkForBuy){
            return
                    Math.max(
                    BestTime(arr,length+1,profit-arr[length],false),
                    BestTime(arr,length+1,profit,true));
        }
        else{
            return
                    Math.max(BestTime(arr,length+1,profit+arr[length],true),
                    BestTime(arr,length+1,profit,false));
        }
    }

    public static void main(String[] args) {
        System.out.println(BestTimeToBuyAndSell(new int[]{30,20,10}));
    }
}
