// Last updated: 10/5/2026, 2:13:40 PM
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
17    static List<String> l = new ArrayList<>();
18    public String smallestFromLeaf(TreeNode root) {
19        l.clear();
20        dfs(root,new StringBuilder());
21        Collections.sort(l);
22        return l.get(0);
23    }
24    static void dfs(TreeNode root,StringBuilder sb){
25        if(root==null){
26            return;
27        }
28        sb.append((char)(root.val+97));
29        if(root.left==null && root.right==null){
30            sb.reverse();
31            l.add(sb.toString());
32            sb.reverse();
33            sb.deleteCharAt(sb.length() - 1);
34            return;
35        }
36        dfs(root.left,sb);
37        dfs(root.right,sb);
38        sb.deleteCharAt(sb.length() - 1);
39    }
40}