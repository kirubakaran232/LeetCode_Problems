// Last updated: 5/25/2026, 7:11:07 PM
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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null) return null;
        helper(root.left,root.right,1);
        return root;
    }
    public void helper(TreeNode r1,TreeNode r2,int lvl) {
        if(r1==null && r2==null) return;
        if(lvl%2!=0){
            int temp = r1.val;
            r1.val = r2.val;
            r2.val = temp;
        }
        helper(r1.left,r2.right,lvl+1);
        helper(r1.right,r2.left,lvl+1);
    }
}