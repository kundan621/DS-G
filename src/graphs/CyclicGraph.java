package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class CyclicGraph {
    private static class Edge {
        int source;
        int neighbour;
        int weight;

        public Edge(int source, int neighbour, int weight) {
            this.source = source;
            this.neighbour = neighbour;
            this.weight = weight;
        }
    }

    static class Pair {
        int vertex;
        String pathSoFar;

        Pair(int vertex, String pathSoFar) {
            this.vertex = vertex;
            this.pathSoFar = pathSoFar;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices = scanner.nextInt();
        System.out.println("Enter the number of edges");
        int edges = scanner.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        scanner.nextLine();
        for (int i = 0; i < edges; i++) {
            String part = scanner.nextLine();
            String[] parts = part.split(" ");
            int source = Integer.parseInt(parts[0]);
            int neighbour = Integer.parseInt(parts[1]);
            int weight = Integer.parseInt(parts[2]);
            graph[source].add(new Edge(source, neighbour, weight));
            graph[neighbour].add(new Edge(neighbour, source, weight));
        }
        boolean[] visited = new boolean[vertices];
        //RM*WA*
        for (int v = 0; v < vertices; v++) {
            if (!visited[v]) {
                //traverse
                boolean cycle = isCyclic(graph, v, visited);
                if (cycle) {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);

    }

    public static boolean isCyclic(ArrayList<Edge>[] graph, int source, boolean[] visited) {
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(source, source + ""));
        while (queue.size() > 0) {
            Pair remove = queue.removeFirst();
            if (visited[remove.vertex]) {
                return true;
            }
            visited[remove.vertex] = true;
            for (Edge edge : graph[remove.vertex]) {
                if (!visited[edge.neighbour]) {
                    queue.add(new Pair(edge.neighbour, remove.pathSoFar + edge.neighbour));
                }
            }
        }
        return false;
    }
}

