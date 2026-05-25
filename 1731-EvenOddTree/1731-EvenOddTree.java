// Last updated: 5/25/2026, 7:14:22 PM
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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean lvl = true;
        // if(root.val%2!=0)
            q.add(root);
        // else return false;
        while(!q.isEmpty()){
            int size = q.size();
            int prev = lvl ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();

                if(lvl && curr.val%2==0) return false;
                if(!lvl && curr.val%2!=0) return false;

                if(lvl && curr.val<=prev) return false;
                if(!lvl && curr.val>=prev) return false;

                prev = curr.val;

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            lvl=!lvl;
        }
        return true;
    }
}
                

                
            