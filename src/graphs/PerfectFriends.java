package graphs;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectFriends {
    static class Edge {
        int source;
        int neighbour;

        public Edge(int source, int neighbour) {
            this.source = source;
            this.neighbour = neighbour;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter number of students");
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        System.out.println("Enter no of club");
        int club = scanner.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[students];

        for (int i = 0; i < students; i++) {
            graph[i] = new ArrayList<>();
        }

        scanner.nextLine();
        for (int i = 0; i < club; i++) {
            String input = scanner.nextLine();
            String[] edge = input.split(" ");
            int v1 = Integer.parseInt(edge[0]);
            int v2 = Integer.parseInt(edge[1]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        boolean[] visited = new boolean[students];
        for (int i = 0; i < students; i++) {
            if (!visited[i]) {
                ArrayList<Integer> list = new ArrayList<>();
                findConnectedComponents(graph, i, visited, list);
                mainList.add(list);
            }
        }
        int total = 0;
        for (int i = 0; i < mainList.size(); i++) {
            for (int j = i + 1; j < mainList.size(); j++) {
                total = total + mainList.get(i).size() * mainList.get(j).size();
            }
        }
        System.out.println(total);

    }

    private static void findConnectedComponents(ArrayList<Edge>[] graph, int source, boolean[] visited, List<Integer> list) {
        visited[source] = true;
        list.add(source);
        for (Edge edge : graph[source]) {
            if (!visited[edge.neighbour])
                findConnectedComponents(graph, edge.neighbour, visited, list);
        }

    }

}
