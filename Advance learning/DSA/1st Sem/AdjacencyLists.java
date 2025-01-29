import java.util.ArrayList;

public class AdjacencyLists {
    public static void main(String[] args) {
        
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