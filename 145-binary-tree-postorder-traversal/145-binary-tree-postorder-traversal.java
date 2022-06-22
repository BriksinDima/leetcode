/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
 public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        return helper(list,root);
    }
     public static List<Integer> helper(List<Integer> list,TreeNode root){
        if(root==null)
            return list;
        else {
            helper(list,root.left);
            helper(list,root.right);
            list.add(root.val);
        }
        return list;
    }
 
}