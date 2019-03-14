package Easy.Reverse_Words_in_a_StringIII;

import java.util.Stack;

public class Solution1 {

    public static String reverseWords(String s) {

        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();

    }


    public static void main(String[] args){
    String s=    reverseWords("Let's take LeetCode contest");

    System.out.println(s);
    }
}
