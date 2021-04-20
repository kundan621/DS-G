package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class BreadthFirstTraversal {
    static class Edge {
        private int source;
        private int neighbour;
        private int weight;

        Edge(int source, int neighbour, int weight) {
            this.source = source;
            this.neighbour = neighbour;
            this.weight = weight;
        }

    }

    private static class Vertex {
        int vertex;
        String pathSoFar;

        public Vertex(int vertex, String pathSoFar) {
            this.vertex = vertex;
            this.pathSoFar = pathSoFar;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int vertices = scanner.nextInt();
        int edges = scanner.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        scanner.nextLine();
        for (int i = 0; i < edges; i++) {
            String edge = scanner.nextLine();
            String[] edgeParameters = edge.split(" ");
            int source = Integer.parseInt(edgeParameters[0]);
            int neighbour = Integer.parseInt(edgeParameters[1]);
            int weight = Integer.parseInt(edgeParameters[2]);
            graph[source].add(new Edge(source, neighbour, weight));
            graph[neighbour].add(new Edge(neighbour, source, weight));
        }
        boolean[] visited = new boolean[vertices];
        int source = scanner.nextInt();
        traverse(graph, source, visited);

    }

    //Rm*Wa*
    static void traverse(ArrayList<Edge>[] graph, int source, boolean[] visited) {
        ArrayDeque<Vertex> queue = new ArrayDeque<>();
        queue.add(new Vertex(source, source + ""));
        while (!queue.isEmpty()) {
            Vertex vertex = queue.remove();
            if (visited[vertex.vertex])
                continue;
            else
                visited[vertex.vertex] = true;
            System.out.println(vertex.vertex + "@" + vertex.pathSoFar);
            for (Edge edge : graph[vertex.vertex]) {
                if (visited[edge.neighbour])
                    continue;
                queue.add(new Vertex(edge.neighbour, vertex.pathSoFar + "" + edge.neighbour));
            }

        }
    }
}

