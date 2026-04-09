public class GfgBfs {
    
}
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        bfs(adj, new boolean[adj.size()], list, 0);
        return list;
    }
    
    public void bfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, ArrayList<Integer> list, int node){
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited[node]=true;
        while(!q.isEmpty()){
            int index = q.poll();
            list.add(index);
            for(int element: graph.get(index)){
                if(!visited[element]){
                    q.offer(element);
                    visited[element]=true;
                }
            }
        }
    }
}