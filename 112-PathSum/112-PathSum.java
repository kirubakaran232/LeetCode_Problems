// Last updated: 5/26/2026, 12:01:09 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution{
17    static boolean dfs(TreeNode root,int sum,int target){
18        if(root==null){
19            return false;
20        }
21        if(root.left==null&&root.right==null){
22            return sum+root.val==target;
23        }
24        sum= sum+root.val;
25        return dfs(root.left,sum,target)||dfs(root.right,sum,target);
26    }
27    public boolean hasPathSum(TreeNode root,int targetSum){
28        return dfs(root,0,targetSum);
29    }
30}