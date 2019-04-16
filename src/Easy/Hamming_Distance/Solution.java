package Easy.Hamming_Distance;

public class Solution {

    int hammingDistance(int x, int y) {
        int xor=x^y;
        int count=0;
        while(xor!=0){
            xor=xor&(xor-1);
            count++;
        }
        return count;

    }
    public static void main(String[] args){


            int a=2;
            System.out.println("a 非的结果是："+(~a));

    }
}
