package Compro1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timot
 */
import java.util.Scanner;

public class TGLA_10LaboratoryExercise1 {

    public static void main(String[] args) {
        char[][] busSeats = new char[10][4];

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 4; col++) {
                busSeats[row][col] = '*';
            }
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            displaySeatStatus(busSeats);
            
            System.out.print("Enter row number 1-10 (-1 to exit): ");
            int row = scanner.nextInt();

            if (row < 0) {
                System.out.println("Exiting reservation system. Goodbye!");
                break;
            }

            System.out.print("Enter seat number 1-4: ");
            int seat = scanner.nextInt();

            if (row < 1 || row > 10 || seat < 1 || seat > 4) {
                System.out.println("Invalid input. Row and seat numbers must be between 1 and 10, 1 and 4 respectively.");
                continue;
            }

            if (busSeats[row - 1][seat - 1] == 'X') {
                System.out.println("Sorry, the seat is already reserved. Please choose another seat.");
            } else {
                busSeats[row - 1][seat - 1] = 'X';
                System.out.println("Seat reserved successfully!");
            }
        }

        scanner.close();
    }

    private static void displaySeatStatus(char[][] seats) {
        System.out.println("Current Seat Status:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(seats[i][j] + " \t");
            }
            System.out.println();
        }
    }
}

