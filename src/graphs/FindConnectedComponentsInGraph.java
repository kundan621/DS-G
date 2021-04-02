package graphs;

import java.util.ArrayList;
import java.util.Scanner;

//Primary Question:: logic i basically to iterate over all the vertice
public class FindConnectedComponentsInGraph {
    private static class Edge {
        int source;
        int neighbour;
        int weight;

        public Edge(int source, int neighbour, int weight) {
            this.source = source;
            this.neighbour = neighbour;
            this.weight = weight;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter number of vertices");
            int vertices = scanner.nextInt();
            ArrayList<Edge>[] graph = new ArrayList[vertices];
            for (int i = 0; i < vertices; i++) {
                graph[i] = new ArrayList<>();
            }
            System.out.println("enter the edges");
            int edge = scanner.nextInt();
            String input = scanner.nextLine();
            for (int i = 0; i < edge; i++) {
                input = scanner.nextLine();
                String[] inputs = input.split(" ");
                int source = Integer.parseInt(inputs[0]);
                int neighbour = Integer.parseInt(inputs[1]);
                int weight = Integer.parseInt(inputs[2]);
                graph[source].add(new Edge(source, neighbour, weight));
                graph[neighbour].add(new Edge(neighbour, source, weight));
                boolean[] visited = new boolean[vertices];
                ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
                for (int v = 0; v < vertices; v++) {
                    if (!visited[vertices]) {
                        ArrayList<Integer> comp = new ArrayList<>();
                        drawTreeAndGenerateComp(graph, v, comp, visited);
                        comps.add(comp);
                    }
                }
            }

        }

        private static void drawTreeAndGenerateComp(ArrayList<Edge>[] graph, int source, ArrayList<Integer> comp, boolean[] visited) {
            visited[source] = true;
            comp.add(source);
            for (Edge e : graph[source]) {
                if (!visited[e.neighbour]) {
                    drawTreeAndGenerateComp(graph, e.neighbour, comp, visited);
                }
            }
        }


    }
}

