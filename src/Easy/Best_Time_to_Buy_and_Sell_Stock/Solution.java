package Easy.Best_Time_to_Buy_and_Sell_Stock;

public class Solution {
    public static int maxProfit(int[] prices) {

        int maxPrice=0;
        for(int i=0;i<prices.length-1;i++){
            for (int j=i+1;j<prices.length;j++){
                int profit=prices[j]-prices[i];
                if(profit>maxPrice){
                    maxPrice=profit;
                }
            }

        }

        return maxPrice;
    }

    public static void main(String[] args){

        int[] price={7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
}
