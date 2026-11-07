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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    public int dfs(TreeNode node,int Maxval)
    {
        if(node==null)return 0;

        int res=node.val>=Maxval?1:0;
        Maxval=Math.max(node.val,Maxval);
        res+=dfs(node.left,Maxval);
        res+=dfs(node.right,Maxval);
        return res;

    }
}