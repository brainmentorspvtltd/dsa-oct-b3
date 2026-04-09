import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class GraphDemo {
    public static List<List<Integer>> createGraph(int V) {
        /*
        1 ------ 2
        |        |
        |        |
        4 ------ 3
         */

        // [[2,4],[1,3],[2,4],[1,3]]
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }
        // [[],[],[],[]]
        graph.get(0).add(2);
        graph.get(0).add(4);
        // [[2,4],[],[],[]]

        graph.get(1).add(1);
        graph.get(1).add(3);
        // [[2,4],[1,3],[],[]]

        graph.get(2).add(2);
        graph.get(2).add(4);
        // [[2,4],[1,3],[2,4],[]]

        graph.get(3).add(1);
        graph.get(3).add(3);
        // [[2,4],[1,3],[2,4],[1,3]]

        return graph;
    }

    public static void bfs(List<List<Integer>> graph, boolean[] visited, int val) {
        System.out.print(val+" ");
        // [T, F, F, F]
        Queue<Integer> q = new LinkedList<>();
        q.offer(val);
        visited[val-1] = true;
    // [[2,4],[1,3],[2,4],[1,3]]
        while(!q.isEmpty()){
            int element = q.poll();
            for(int v: graph.get(element-1)){
                if(visited[v-1]==false){
                    bfs(graph, visited, v);
                }
            }
        }
    }
    public static void dfs(List<List<Integer>> graph, boolean[] visited, int val) {
        // [T, T, F, T]
        System.out.print(val+" ");
        int index = val - 1;
        visited[index] = true;

        // [[2,4],[1,3],[2,4],[1,3]]
        for(int element: graph.get(index)){
            if(visited[element-1]==false){
                dfs(graph, visited, element);
            }
        }
    }

    public static List<List<Integer>> adjList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total nodes: ");
        int v = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
        System.out.println("Enter edges count: ");
        int edges = sc.nextInt();

        for(int i=0;i<edges;i++){
            System.out.println("Values of edge #"+(i+1)+": (m, n)");
            int m = sc.nextInt();
            int n = sc.nextInt();

            graph.get(m-1).add(n);
            graph.get(n-1).add(m);
        }

        sc.close();
        return graph;
    }
    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> graph = createGraph(V);
        graph = adjList();

        // System.out.println(graph);

        dfs(graph, new boolean[graph.size()], 1);
        System.out.println();
        bfs(graph, new boolean[graph.size()], 1);
        System.out.println();
        
    }
}
