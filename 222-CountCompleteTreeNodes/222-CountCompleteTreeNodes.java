// Last updated: 6/2/2026, 10:26:04 PM
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
16class Solution {
17    public int countNodes(TreeNode root) {
18        if (root == null)
19            return 0;
20        int count = 1;
21        Queue<TreeNode> q = new LinkedList<>();
22        q.add(root);
23        while (!q.isEmpty()) {
24            TreeNode curr = q.poll();
25            if (curr.left != null) {
26                count++;
27                q.add(curr.left);
28            }
29            if (curr.right != null) {
30                count++;
31                q.add(curr.right);
32            }
33        }
34        return count;
35    }
36}