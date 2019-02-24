package Medium.SINGLE_ELEMENT_IN_A_SORTED_ARRAY;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {


    public static int singleNonDuplicate(int[] nums) {

        for (int i=0;i<nums.length;i++){
           if (binary(nums,nums[i])){
               continue;
           }else{
               return nums[i];
           }

        }

        return 0;
    }
    public static boolean binary(int[] array, int value)
    {
        int low = 0;
        int high = array.length - 1;
        while(low <= high)
        {
            int middle = (low + high) / 2;
            if(value == array[middle])
            {
                return true;
            }
            if(value > array[middle])
            {
                low = middle + 1;
            }
            if(value < array[middle])
            {
                high = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args){

        int[] num={1,1,2};
        System.out.println(singleNonDuplicate(num));
    }
}
