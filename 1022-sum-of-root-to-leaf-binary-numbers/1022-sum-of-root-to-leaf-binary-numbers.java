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
    private int sum(TreeNode root, int prev){
        if(root==null) return 0;
        if(root.left==null && root.right == null)
            return prev*2+root.val;
        return sum(root.left,prev*2+root.val) + sum(root.right,prev*2+root.val);
    }
    
    public int sumRootToLeaf(TreeNode root) {
        return sum(root,0);
    }
}