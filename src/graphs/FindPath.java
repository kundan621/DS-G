package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPath {
    static class Edge {
        int src;
        int neighbour;
        int weight;

        Edge(int src, int neighbour, int weight) {
            this.src = src;
            this.neighbour = neighbour;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
//        String input="""
//                    7
//                    8
//                    0 1 10
//                    1 2 10
//                    2 3 10
//                    0 3 10
//                    3 4 10
//                    4 5 10
//                    5 6 10
//                    4 6 10
//                    0
//                    6
//                    """;
        System.out.println("Enter the number of Vertices");
        Scanner scanner = new Scanner(System.in);
        int vertices = scanner.nextInt();
        List<Edge>[] graph = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        System.out.println("Enter the number of edges");
        int edges = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < edges; i++) {
            String part = scanner.nextLine();
            String parts[] = part.split(" ");
            int v1 = Integer.parseInt(parts[0]); //src
            int v2 = Integer.parseInt(parts[1]);
            int weight = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, weight));
            graph[v2].add(new Edge(v2, v1, weight));

        }
        int source = scanner.nextInt();
        int destination = scanner.nextInt();
        boolean[] visited = new boolean[vertices];
        System.out.println(hasPath(graph, source, destination, visited, ""));
    }

    public static boolean hasPath(List<Edge>[] graph, int source, int destination, boolean[] visited, String pathTillNow) {
        //if(0==6) true pr else trust neighbours. If neighbours to destination has path then path exists from you also.
        if (source == destination) {
            System.out.println(pathTillNow + destination);
            return true;
        }
        visited[source] = true;
        pathTillNow = pathTillNow + source;
        for (Edge edge : graph[source]) {
            if (!visited[edge.neighbour]) {
                boolean hasNeighbourPath = hasPath(graph, edge.neighbour, destination, visited, pathTillNow);
                if (hasNeighbourPath) {
                    return true;
                }
            }

        }
        return false;
    }
}
