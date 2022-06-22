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
    
 
    public int sumOfLeftLeaves(TreeNode root) {
        return traverse(root, 0, false);
    }
    
    private int traverse(TreeNode root, int sum, boolean isLeft) {
        if(root == null) return 0;
        if(root.left == null && root.right == null && isLeft){
           return root.val;
        } 
        return traverse(root.left, sum, true) + traverse(root.right, sum, false);
 
    }
}