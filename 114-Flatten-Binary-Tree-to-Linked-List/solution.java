/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        // handling null root.
        if (root == null){
            return;
        }
        
        // handling leaf node.
        if (root.left == null && root.right == null){
            return;
        }
        
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        if (left != null){
            while(left.right != null){
                left = left.right;
            }
            left.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        
    }
}