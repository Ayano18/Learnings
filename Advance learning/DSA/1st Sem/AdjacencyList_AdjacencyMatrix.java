import java.util.*;
public class AdjacencyList_AdjacencyMatrix {
    public static void main(String[] args) {
        char[] v = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        int[][] adjacencyMatrix = {
            {0, 1, 0, 0, 0, 0, 0}, // A
            {1, 0, 1, 0, 0, 0, 0}, // B
            {0, 1, 0, 1, 1, 0, 0}, // C
            {0, 0, 1, 0, 0, 1, 1}, // D
            {0, 0, 1, 0, 0, 1, 0}, // E
            {0, 0, 0, 1, 1, 0, 0}, // F
            {0, 0, 0, 1, 0, 0, 0}  // G
        };

        System.out.println("Adjacency Matrix:");
        System.out.print("  ");
        for (char vertex : v) {
            System.out.print(vertex + " ");
        }
        System.out.println();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            System.out.print(v[i] + " ");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("Adjancency Lists:");
        ArrayList<ArrayList<Character>> listed = new ArrayList<>();
        
        char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int num = 7;
        
        for (int i = 0; i < num; i++) {
            listed.add(new ArrayList<>());
        }
        addAll(listed.get(0), 'B');
        addAll(listed.get(1), 'A','C');
        addAll(listed.get(2), 'B','D','E');
        addAll(listed.get(3), 'C','E','F','G');
        addAll(listed.get(4), 'C','D','F');
        addAll(listed.get(5), 'D','E');
        addAll(listed.get(6), 'D');
        
        int bounds = 0;
        for (int i = 0; i < num; i++, bounds++) {
            System.out.println(vertices[bounds] + ": " + listed.get(i));
        }
    }
    private static ArrayList<Character> addAll(ArrayList<Character> list, Character... elements) {
        for (Character element : elements) {
            list.add(element);
        }
        return list;
    }
}
