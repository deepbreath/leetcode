package Easy.Two_Sum_IV_Input_is_a_BST;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean findTarget(TreeNode root, int k) {

        Set<Integer> integers=new HashSet<>();

        return findTreeNode(root,k,integers);
    }

    public boolean findTreeNode(TreeNode treeNode, int k, Set<Integer> integers){

        if(treeNode==null){
            return false;
        }
        if (integers.contains(k-treeNode.val)){
            return true;
        }
        integers.add(treeNode.val);
        return findTreeNode(treeNode.left,k,integers)||findTreeNode(treeNode.right,k,integers);

    }
}
