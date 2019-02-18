package Easy.Best_Time_to_Buy_and_Sell_Stock;

public class Solution2 {
    /**
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int miniPrice=Integer.MAX_VALUE;
        int maxPorfit=0;
        for (int i=0;i<prices.length;i++){
            if(prices[i]<miniPrice){ //如果获取到的价格比原来的最小价格还要小则去取最小的价格直到取到数组最小的值
                miniPrice=prices[i];
            }else if(prices[i]-miniPrice>maxPorfit){//如果当前获取的价格减去最小的买入值大于之前的最大收益则替换掉最大收益
                maxPorfit=prices[i];
            }
        }


        return maxPorfit;
    }

    public static void main(String[] args){

        int[] price={7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
}
