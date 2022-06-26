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

    int diff = Integer.MAX_VALUE ;
    int prev = -1 ;
    public int minDiffInBST(TreeNode node) {
        if(node == null) return diff ; 
        minDiffInBST(node.left) ;
        if(prev != -1) diff = Math.min (node.val - prev , diff );      //updating difference ( previous node - current node )
        prev = node.val ;                                                              //contains previous node val
        minDiffInBST(node.right) ;
        return diff ;
    
    }
}