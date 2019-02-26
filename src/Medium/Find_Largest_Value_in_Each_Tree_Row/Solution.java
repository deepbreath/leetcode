package Medium.Find_Largest_Value_in_Each_Tree_Row;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {



    public List<Integer> largestValues(TreeNode root) {


        List<Integer> largest=new LinkedList<>();
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();

        if (null==root){
            return largest;
        }
        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()){
            int max=Integer.MIN_VALUE,size=treeNodeQueue.size();
            for (int i=0;i<size;i++){
                TreeNode node=treeNodeQueue.remove();
                max=Math.max(node.val,max);
                if(null!=node.left){
                    treeNodeQueue.add(node.left);
                }
                if (null!=node.right){
                    treeNodeQueue.add(node.right);
                }

            }
            largest.add(max);

        }




        return  largest;

    }


}
