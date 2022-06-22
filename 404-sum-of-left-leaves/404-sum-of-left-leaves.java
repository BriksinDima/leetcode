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
        return traverse(root, 0, "root");
    }
    
    private int traverse(TreeNode root, int sum, String side) {
        if(root == null) return 0;
        if(root.left == null && root.right == null && side.equals("left")){
           return root.val;
        } 
        int left =  traverse(root.left, sum, "left");
        int right =  traverse(root.right, sum, "right");
        
     
        return left+right;
    }
}