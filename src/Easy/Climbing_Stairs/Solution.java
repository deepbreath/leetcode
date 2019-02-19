package Easy.Climbing_Stairs;

public class Solution {
    public static int climbStairs(int n) {

        if(n<=0){
            return 0;
        }
        if (n==2){
            return 2;
        }
        if (n==1){
            return 1;
        }
        int one_step=1;
        int two_steps=2;
        int all_ways=1;

        /**
         * 空数组
         */
        int[] num=new int[n];
        for (int i=0;i<n;i++){
            num[i]=1;
        }




        return 0;
    }
    public static void main(String[] args){

        System.out.println(climbStairs(10));

    }
}
