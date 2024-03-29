# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        max_depth = 0
        stack = []

        stack.append((root,1))

        while stack:
            node, level = stack.pop()
            if node:
                max_depth = max(level, max_depth)
                stack.append((node.left,level+1))
                stack.append((node.right, level+1))
        return max_depth