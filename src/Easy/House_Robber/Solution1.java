package Easy.House_Robber;

public class Solution1 {

    public  int rob(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int a=nums[0];
        int b=Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            int temp=b;
            b=Math.max(a+nums[i],b);
            a=temp;
        }


        return b;
    }

    public static void main(String[] args){

        Solution1 solution=new Solution1();

        int[] nums={1,2,3,5,7,8,9};

        int num= solution.rob(nums);
    }
}
