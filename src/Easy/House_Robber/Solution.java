package Easy.House_Robber;

public class Solution {

    int sum1=0;
    int sum2=0;
    public  int rob(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }





        return 9;


    }

    public static void main(String[] args){

        Solution solution=new Solution();

        int[] nums={1,1};

      int num= solution.rob(nums);
    }
}
