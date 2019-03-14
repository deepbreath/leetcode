package Easy.Reverse_Words_in_a_StringIII;

import java.util.Stack;

public class Solution {

    public static String reverseWords(String s) {

        char[]  value=s.toCharArray();

        StringBuilder builder=new StringBuilder();

        Stack stack=new Stack();
        int nums=0;

        for (int i=0;i<value.length;i++){

           String num= String.valueOf(value[i]);

            if(num.equals(" ")){
                for (int k=0;k<nums;k++){
                    builder.append(stack.pop());
                }
                builder.append(num);
                nums=0;
            }else {
                nums+=1;
                stack.push(num);
            }
        }

        if(nums!=0){
            for (int k=0;k<nums;k++){
                builder.append(stack.pop());
            }
        }

    return builder.toString();
    }


    public static void main(String[] args){
    String s=    reverseWords("Let's take LeetCode contest");

    System.out.println(s);
    }
}
