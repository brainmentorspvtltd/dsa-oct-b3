public class GfgDfs {
    
}
class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfs(adj, new boolean[adj.size()], 0, list);
        return list;
    }
    
    public void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int node, ArrayList<Integer> list){
        list.add(node);
        visited[node] = true;
        for(int element: graph.get(node)){
            if(!visited[element])
            dfs(graph, visited, element, list);
        }
    }
}