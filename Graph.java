import java.util.*;
class Graph{ 
    private Map<Integer, List<Integer>> adjList= new HashMap<>();
public static void main (String args[]) {
    Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        
        printGraph(g);

        System.out.println("BFS starting from node 1:");
        g.bfs(1);
        System.out.println("\nDFS starting from node 1:");
        g.dfs(1);
    System.out.println();
    System.out.println("Graph created successfully.");
    }

    public void addEdge(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(destination).add(source); // For undirected graph
    }

    public List<Integer> getNeighbors(int node) {
        return adjList.getOrDefault(node, new ArrayList<>());
    }

    public static void printGraph(Graph g) {
        for (Map.Entry<Integer, List<Integer>> entry : g.adjList.entrySet()) {
            System.out.println("Node " + entry.getKey() + " has neighbors: " + entry.getValue());
        }
    }

        public void bfs(int start) {
            Set<Integer> visited = new HashSet<>();
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            visited.add(start);

            while (!queue.isEmpty()) {
                int node = queue.poll();
                System.out.print(node + " ");

                for (int neighbor : getNeighbors(node)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
    }
    private void dfsHelper(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : getNeighbors(node)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }
}