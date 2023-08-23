package org.launchcode;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// BASIC SOLUTION
//        System.out.println("Enter radius of the circle: ");
//        double radius = input.nextDouble();
//        double area = Circle.getArea(radius);
//        System.out.println("The area of circle with "+ radius + " is: " + area);

        //BONUS MISSION 1
//        System.out.println("Enter radius of the circle:");
//
//        if (input.hasNextDouble()){
//            double radius = input.nextDouble();
//
//            if (radius > 0){
//                double area = Circle.getArea(radius);
//                System.out.println("The area of circle with "+ radius + " is: " + area);
//            } else{
//                System.out.println("Sorry. The radius has to be a positive number.");
//            }
//        }else{
//            System.out.println("Sorry. That is not a valid number.");
//        }
//BONUS MISSION 2 - do-while loop

        double radius;

        do{
            System.out.println("Enter a positive number for radius: ");

            while(!input.hasNextDouble()){
                System.out.println("The radius must be a number. Please try again!");
                input.next();
            }
            radius = input.nextDouble();

        }while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of circle with "+ radius + " is: " + area);

        input.close();

    }
}
