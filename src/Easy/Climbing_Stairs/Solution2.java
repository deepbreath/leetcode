package Easy.Climbing_Stairs;

public class Solution2 {
    /**
     * 使用斐波那契递推的方法来进行计算
     * @param n
     * @return
     */
    public static int climbStairs(int n) {

        if(n==1){
            return 1;
        }

        int[] array=new int[n+1];
        array[1]=1;
        array[2]=2;
        for (int i=3;i<=n;i++){
            array[i]=array[i-1]+array[i-2];
        }
        return array[n];
    }

    public static void main(String[] args){

        System.out.println(climbStairs(10));

    }
}
