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
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            if (!symmetricQueue(q)){
                return false;
            }
            while (size > 0){
                TreeNode now = q.poll();
                if (now != null){
                    q.add(now.left);
                    q.add(now.right);
                }
                size -= 1;
            }
        }
        return true;
    }
    
    private boolean symmetricQueue(Queue<TreeNode> q){
        ArrayList<TreeNode> list = new ArrayList<>();
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        for(int i = 0; i < list.size(); i++){
            q.add(list.get(i));
        }
        for (TreeNode t : list){
            if (t != null){
                System.out.print(t.val);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        int start = 0;
        int end = list.size() - 1;
        while (start < end){
            if ((list.get(start) == null && list.get(end) == null)){
                start += 1;
                end -= 1;
            } else if ((list.get(start) != null && list.get(end) != null) && (list.get(start).val == list.get(end).val)){
                start += 1;
                end -= 1;
            } else {
                return false;
            }
        }
        return true;
    }
}