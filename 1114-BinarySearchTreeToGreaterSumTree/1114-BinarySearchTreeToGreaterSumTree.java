// Last updated: 5/25/2026, 7:16:52 PM
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
    public void GT(TreeNode root){
        if(root==null) return;
        GT(root.right);
        sum+=root.val;
        root.val=sum;
        GT(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        GT(root);
        return root;
    }
}