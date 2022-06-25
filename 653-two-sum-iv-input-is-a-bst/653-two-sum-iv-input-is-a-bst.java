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
    Map<Integer, Integer> mapNodes = new HashMap<>();
    
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        int target = k - root.val;
        if(mapNodes.get(target) != null){
            return true;
        }
        mapNodes.put(root.val, root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
        
    }
    
    
}