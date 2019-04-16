package Easy.Find_All_Anagrams_in_a_String;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public  static List<Integer> findAnagrams(String s, String p) {


char[] strings=s.toCharArray();

char[] pString=p.toCharArray();

List<Integer> index=new LinkedList<>();

List<Integer> maps=new LinkedList<>();

int nums=0;

    for(int i=0;i<strings.length;i++){

        String num= String.valueOf(strings[i]);

        for (int j=0;j<pString.length;j++){

            if(num.equals(String.valueOf(pString[j]))){
                nums++;
                //判断是否连续
                if(index.get(index.size()-1)==i-1){
                    index.add(i);

                    if(nums==pString.length){
                        nums=0;
                        i--;
                        maps.add(index.get(0));
                        index.clear();
                    }
                }else{
                    nums=0;
                    i--;
                    index.clear();
                }

            }

        }


    }









    return maps;
    }

    public static void main(String[] args){

      List<Integer> list=  findAnagrams("cbaebabacd","abc");




    }


}
