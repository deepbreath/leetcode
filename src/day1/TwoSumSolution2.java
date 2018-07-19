package day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution2 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>(16);

     for (int i=0;i<nums.length;i++){
         int result=target-nums[i];
         if (map.containsKey(result)){
             return new int[]{map.get(result),i};
         }
         map.put(nums[i],i);
     }

        return new int[]{0,0};
    }

    public static void main(String[] args){

        TwoSumSolution2 twosum=new TwoSumSolution2();
        int[] num={2,11,7,15};
        int target=9;
        int[] result=twosum.twoSum(num,target);

        System.out.println(result.toString());

    }
}