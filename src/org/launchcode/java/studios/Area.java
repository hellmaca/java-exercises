package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static void findArea() {
        double area;
        double radius;
        double pi = 3.14;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("What is the radius of the circle?");
            radius = in.nextDouble();
        } while (radius < 0);
        area = pi * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
