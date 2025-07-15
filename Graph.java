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
} 