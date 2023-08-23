package org.launchcode;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// BASIC SOLUTION
        System.out.println("Enter radius of the circle: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of circle with "+ radius + " is: " + area);

        input.close();

    }
}
