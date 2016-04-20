# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def flatten(self, root):
        """
        :type root: TreeNode
        :rtype: void Do not return anything, modify root in-place instead.
        """
        if root is None:
            return None
        
        self.flatten(root.left)
        self.flatten(root.right)
        # swap left and right son to make sure the finall tree is right skewed.
        root.left, root.right = root.right, root.left
        rightSon = root
        while rightSon.right != None:
            rightSon = rightSon.right
        rightSon.right = root.left
        root.left = None
        