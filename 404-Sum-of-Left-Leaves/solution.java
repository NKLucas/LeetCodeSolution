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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
    
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int result = 0;
        
        while(!q.isEmpty()) {
            TreeNode now = q.poll();
            if (now.left != null) {
                q.offer(now.left);
            }
            if (now.right != null) {
                q.offer(now.right);
            }
            if (now.left != null && now.left.left == null && now.left.right == null){
                result += now.left.val;
            }
        }
        return result;
    }
    
}