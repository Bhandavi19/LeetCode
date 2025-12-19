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
    
    public int maxLevelSum(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 1;
        int anslevel=1;
        int maxsum = Integer.MIN_VALUE;

        while(!q.isEmpty()){
            int size = q.size();
            
            int sum=0;

            ArrayList<Integer> arr = new ArrayList<>();            
            for(int i=0;i<size;i++){
                
                TreeNode t = q.poll();
                sum += t.val;

                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);

                arr.add(t.val);
            }
            if(sum > maxsum){
                maxsum = sum;
                anslevel = level;
            }
            level++;
        }
        return anslevel;
    }
}