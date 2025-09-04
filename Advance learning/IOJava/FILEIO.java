import java.util.*;
import java.io.*;
public class FILEIO{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            File file = new File("C:\\Users\\Timot\\OneDrive\\Documents\\Advance learning\\IOJava\\filehandling.txt");
            if (file.createNewFile()) {
              System.out.println("File created: " + file.getName());
              
            } else {
              System.out.println("File already exists.");
              System.out.println("Path: "+file.getAbsolutePath());

              System.out.println();//haha

              try {
                FileWriter myWriter = new FileWriter("C:\\Users\\Timot\\OneDrive\\Documents\\Advance learning\\IOJava\\filehandling.txt");
                System.out.print("Enter any text you want in file: ");
                myWriter.write(s.next());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");

                System.out.println();//haha

                try {
                  File myObj = new File("C:\\Users\\Timot\\OneDrive\\Documents\\Advance learning\\IOJava\\filehandling.txt");
                  Scanner sc = new Scanner(myObj);
                  while (sc.hasNextLine()) {
                    String data = sc.nextLine();
                    System.out.println(data);
                  }
                  sc.close();
                } catch (FileNotFoundException e) {
                  System.out.println("An error occurred.");
                  e.printStackTrace();
                }

              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }

            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}