package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter the amount of gas used in gallons: ");
        double gallons = input.nextDouble();
        input.close();

        double milesPerGallon = miles/gallons;

        System.out.printf("Miles per Gallon: %.2f mpg", milesPerGallon);
    }
}
