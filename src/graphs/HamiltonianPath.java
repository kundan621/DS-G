package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//H path: Should contain all the vertices in the path
//H cycle: IF has all above poperty but end is connected with start.
//Question is same has print all paths except that it's base condition is to print all the paths.
//7
//        9
//    0 1
//   0 3
//   1 2
//    2 3
//   2 5
//   5 6
//   4 6
//   3 4
//   4 5
public class HamiltonianPath {
    static private class Edge {
        int source;
        int neighbour;

        public Edge(int source, int neighbour) {
            this.source = source;
            this.neighbour = neighbour;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices = scanner.nextInt();
        System.out.println("Enter the number of Edges");
        int edges = scanner.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        scanner.nextLine();
        for (int i = 0; i < edges; i++) {
            String edge = scanner.nextLine();
            String[] verticesOfThisEdge = edge.split(" ");
            int v1 = Integer.parseInt(verticesOfThisEdge[0]);
            int v2 = Integer.parseInt(verticesOfThisEdge[1]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        HashSet<Integer> visited = new HashSet<>();
        int source = 0;
        findPath(graph, source, visited, source + "", source);
    }

    //to check if everythiing is visited can be improved by using hashset    ...hashset.length==graph.length
    private static void findPath(ArrayList<Edge>[] graph, int source, HashSet<Integer> visited, String resultSoFar, int originalSource) {
        visited.add(source);
        // for(int i=0;i<visited.length;i++){
        //   check=check&&visited[i];
        //}
        if (visited.size() == graph.length) {
            boolean cycle = false;
            for (Edge edge : graph[source]) {
                if (edge.neighbour == originalSource) {
                    cycle = true;
                    break;
                }
            }
            if (!cycle)
                System.out.println(resultSoFar + ".");
            else
                System.out.println(resultSoFar + "*");
        }

        for (Edge edge : graph[source]) {
            if (!visited.contains(edge.neighbour)) {
                findPath(graph, edge.neighbour, visited, resultSoFar + edge.neighbour, originalSource);
            }
        }
        visited.remove(source);
    }
}
