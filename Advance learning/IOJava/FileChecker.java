import java.util.*;
import java.io.*;
public class FileChecker {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println();
        final String path = "C:\\Users\\Timot\\OneDrive\\Documents\\Advance learning\\IOJava\\filehandling.txt";
        File file = new File(path);
        System.out.println("File name: "+ file.getName());
        System.out.println("Path: "+ file.getPath());
        System.out.println("Absolute Path: "+ file.getAbsolutePath());
        System.out.println("Parent: "+ file.getParent());
        System.out.println("Exists: "+ file.exists());
        if (file.exists()) {
            System.out.println("is Writable?"+ file.canWrite());
            System.out.println("is Readable?"+ file.canRead());
            System.out.println("is a Directory?"+ file.isDirectory());
            System.out.println("File size: "+ file.length());
        }
    }
}