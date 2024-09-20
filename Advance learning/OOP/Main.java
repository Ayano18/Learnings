import java.util.*;

class MainThread extends Thread {
    public MainThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " is " + getState());
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
        System.out.println(getName() + " is " + getState());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Name your first thread: ");
        String firstThreadName = s.nextLine();
        System.out.print("Name your second thread: ");
        String secondThreadName = s.nextLine();

        MainThread thread1 = new MainThread(firstThreadName);
        MainThread thread2 = new MainThread(secondThreadName);

        System.out.println("\n" + thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());

        // Start the threads
        System.out.println("\nStarting the threads...");
        thread1.start();
        thread2.start();

        // Wait briefly to ensure threads have started
        try {
            Thread.sleep(150); // short delay to allow state change to RUNNABLE
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display states after starting
        System.out.println(thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display final states
        System.out.println("\nAfter sleep...");
        System.out.println(thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());

        s.close();
    }
}
