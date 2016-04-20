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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        String temp = "";
        treePathHelper(root, result, temp);
        return result;
    }
    
    private void treePathHelper(TreeNode root, List<String> result, String temp){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            String s = temp + Integer.toString(root.val);
            result.add(s);
            return;
        }
        String s = temp + Integer.toString(root.val) + "->";
        treePathHelper(root.left, result, s);
        treePathHelper(root.right, result, s);
    }
    
}