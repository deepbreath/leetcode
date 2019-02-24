package Easy.Diameter_of_Binary_Tree;

public class Solution {

    private static int num=0;

    public static int diameterOfBinaryTree(TreeNode root) {
        num=1;
        deep(root);

        return num;
    }

    public static int deep(TreeNode root){
        if (root==null) return 0;
        int left=deep(root.left);
        int right=deep(root.right);
        num=Math.max(num,left+right);

        return Math.max(left,right);
    }

    public static void main(String[] args){

    }

}
