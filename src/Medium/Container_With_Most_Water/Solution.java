package Medium.Container_With_Most_Water;

public class Solution {


    public static int maxArea(int[] height) {

           int maxWater=Integer.MIN_VALUE;

            int minbonder=Integer.MIN_VALUE;



        for (int i=0;i<height.length;i++){

            int leftbonder=height[i];

            int indexs=height.length-1;

           while (indexs!=0){

                int rightbonder=height[indexs];

                minbonder=  Math.min(leftbonder,rightbonder);

                int max=minbonder*indexs;

                maxWater=Math.max(maxWater,max);
               indexs=indexs-1;
            }

        }

        return maxWater;
    }

    public static void main(String[] args){
        int[] num={1,8,6,2,5,4,8,3,7};
        maxArea(num);

    }
}
