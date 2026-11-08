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
   private int ans = -1;
    
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, new int[]{k});
        return ans;
    }
    
    private void dfs(TreeNode node, int[] kRef) {
        if (node == null || ans != -1) return;
        
        dfs(node.left, kRef);
        
        kRef[0]--;
        if (kRef[0] == 0) {
            ans = node.val;
            return;
        }
        
        dfs(node.right, kRef);
    }
}