package Compro2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timothy
 */

import java.util.*;
public class CarDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Car car1 = new Car(2014, Model.SUV, Color.RED);
        Car car2 = new Car(2020, Model.SEDAN, Color.BLUE);

        car1.display();
        car2.display();
    }
}


 class Car {
    private int year;
    private Model model;
    private Color color;

    public Car(int yr, Model m, Color c) {
        this.year = yr;
        this.model = m;
        this.color = c;
    }

    public void display() {
        System.out.println("Car Year: " + year);
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }
}

enum Color {
    RED, BLUE, GREEN, YELLOW, BLACK, WHITE
}
enum Model {
    SEDAN, SUV, CONVERTIBLE, HATCHBACK
}