// Last updated: 5/25/2026, 7:22:07 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean zig = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(zig){
                    if(curr!=null){
                        l.addLast(curr.val);
                    }
                }else{
                    if(curr!=null){
                        l.addFirst(curr.val);
                    }
                }
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            zig=!zig;
            res.add(l);
        }
        return res;
    }
}