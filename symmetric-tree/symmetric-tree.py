# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def helper(node_left, node_right):
            if not node_left and not node_right:
                return True
            if not node_left or not node_right:
                return False
            
            return (node_left.val == node_right.val 
                    and helper(node_left.right, node_right.left) 
                    and helper(node_left.left, node_right.right))
           
        return helper(root.left, root.right)
            
            
            
            