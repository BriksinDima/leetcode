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
public boolean validUtil(TreeNode node, long low, long high) {
        if (node == null) {
            return true;
        }
        if (node.val <= low || node.val >= high) {
            return false;
        }
        return validUtil(node.left, low, node.val) && validUtil(node.right, node.val, high);//upper bound of left subtree is node.val same is lower bound for right sub tree
    }

    public boolean isValidBST(TreeNode root) {
        return validUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);//root node value range
    }
    
 
}