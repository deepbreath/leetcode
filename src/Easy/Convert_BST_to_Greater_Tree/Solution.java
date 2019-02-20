package Easy.Convert_BST_to_Greater_Tree;

/**
 * 只弄明白了这一个方法
 */
public class Solution {
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {

        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }


        return root;

    }

    public static void main(String[] args){
        Solution solution=new Solution();

        TreeNode node=new TreeNode(5);

        node.left=new TreeNode(2);

        node.right=new TreeNode(13);

        System.out.println(solution.convertBST(node));
    }
}
