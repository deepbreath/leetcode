package Hard.Binary_Tree_Postorder_Traversal;

import java.util.*;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> num=new LinkedList<>();

        Stack stack = new Stack();
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();

        if (null==root){
            return stack;
        }
        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()){
            int size=treeNodeQueue.size();
            for (int i=0;i<size;i++){
               TreeNode node=treeNodeQueue.remove();
                if(null!=node.left){
                    treeNodeQueue.add(node.left);
                }
                if (null!=node.right){
                    treeNodeQueue.add(node.right);
                }
                stack.push(new Integer(node.val));
            }


        }


    Iterator iterator= stack.iterator();
while (iterator.hasNext()){
    num.add((Integer)stack.pop());
}

        return num;
    }
}
