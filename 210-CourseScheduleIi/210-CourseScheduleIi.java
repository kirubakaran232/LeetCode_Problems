// Last updated: 5/25/2026, 7:20:44 PM
class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        int[] indegree = new int[numCourses];
        Queue<Integer> que = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < pre.length; i++) {
            list.get(pre[i][1]).add(pre[i][0]);
            indegree[pre[i][0]]++;
        }
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                que.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        int ind = 0;
        while (!que.isEmpty()) {
            int parent = que.poll();
            ans.add(parent);

            for (int node : list.get(parent)) {
                indegree[node]--;
                if (indegree[node] == 0) {
                    que.add(node);
                }
            }
        }
        if (ans.size() != numCourses) {
            return new int[]{};
        }
        int[] arr = new int[numCourses];
        for (int i : ans) {
            arr[ind++] = i;
        }
        return arr;
    }
}