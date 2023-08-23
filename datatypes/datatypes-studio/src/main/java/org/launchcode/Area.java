package org.launchcode;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");
        double userRadius = input.nextDouble();
        double area = 3.14 * userRadius * userRadius;
        System.out.println("The area of circle with "+ userRadius + " is: " + area);

    }
}
