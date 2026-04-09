public class L547 {
    
}
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length; // Number of cities
        boolean[] visited = new boolean[n]; // Track visited cities
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {       // City not yet explored
                bfs(i, isConnected, visited); // Explore its entire province
                provinces++;          // One full province explored
            }
        }
        return provinces;
    }

    private void bfs(int start, int[][] isConnected, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int city = queue.poll();
            for (int neighbor = 0; neighbor < isConnected.length; neighbor++) {
                if (isConnected[city][neighbor] == 1 && !visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}