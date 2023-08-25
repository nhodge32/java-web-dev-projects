package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius of the circle: ");
        try {
            radius = input.nextDouble();
            while(radius < 0) {
                System.out.println("Please enter a number greater than 0: ");
                radius = input.nextDouble();
            }
            double area = Circle.getArea(radius);
            System.out.println("Area of circle is " + area);
        } catch (Exception e) {
            System.out.println("Please enter a valid number: ");
        }
//        radius = input.nextDouble();
//        if(radius < 0) {
//            System.out.println("Please enter a number greater than 0: ");
//        } else {
//            if (input.hasNextDouble())
//
//        }

//        System.out.printf("The area of a circle of radius " + radius + " is: %,.2f", Circle.getArea(radius));

        input.close();
    }
}
