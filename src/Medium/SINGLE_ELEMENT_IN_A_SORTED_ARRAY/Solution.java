package Medium.SINGLE_ELEMENT_IN_A_SORTED_ARRAY;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int singleNonDuplicate(int[] nums) {

        Map<Integer,Integer> num=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            if(num.size()==0){
                num.put(nums[i],1);
            }else {
                if(num.containsKey(nums[i])){
                    int sum=num.get(nums[i])+1;
                    num.put(nums[i],sum);
                    continue;
                }else {
                    num.put(nums[i],1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : num.entrySet()) {
            if(entry.getValue().intValue()==1){
                return entry.getKey().intValue();
            }
        }


return 0;
    }

    public static void main(String[] args){

        int[] num={1,1,2,3,3,4,4,8,8};
       System.out.println(singleNonDuplicate(num));
    }
}
