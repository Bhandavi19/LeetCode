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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return null;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            TreeNode temp = t.left;
            t.left = t.right;
            t.right = temp;
            if(t.left != null) q.offer(t.left);
            if(t.right != null) q.offer(t.right);
        }
        return root;
    }
}