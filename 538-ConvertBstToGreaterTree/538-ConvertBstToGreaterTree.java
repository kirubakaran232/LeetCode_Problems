// Last updated: 5/25/2026, 7:18:50 PM
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
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null;
        GT(root);
        return root; 
    }
    public void GT(TreeNode root){
        if(root==null) return;
        GT(root.right);
        sum+=root.val;
        root.val=sum;
        GT(root.left);
    }
}