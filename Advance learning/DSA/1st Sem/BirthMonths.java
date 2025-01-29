import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BirthMonths {
    public static void main(String[] args) {
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self = new HashSet<>();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the birth months of six classmates.");
        for (int i = 1; i <= 6; i++) {
            System.out.print("Classmate " + i + " birth month: ");
            String month = s.nextLine();
            if (i <= 3) {
                group1.add(month);
            } else {
                group2.add(month);
            }
        }

        System.out.println("\nGroup 1 birth months: " + group1);
        System.out.println("Group 2 birth months: " + group2);

        System.out.print("\nEnter your birth month: ");
        String myMonth = s.nextLine();
        self.add(myMonth);

        Set<String> union = new HashSet<>(group1);
        union.addAll(group2);
        System.out.println("\nUnion of Group 1 and Group 2: " + union);

        Set<String> intersection = new HashSet<>(group1);
        intersection.retainAll(group2);
        System.out.println("Intersection of Group 1 and Group 2: " + intersection);

        Set<String> difference = new HashSet<>(group1);
        difference.removeAll(group2);
        System.out.println("Difference of Group 1 and Group 2: " + difference);

        if (union.contains(myMonth)) {
            System.out.println("\nYou have the same birth month as at least one of your classmates.");
        } else {
            System.out.println("\nYou do not share a birth month with any of your classmates.");
        }

        s.close();
    }
}
