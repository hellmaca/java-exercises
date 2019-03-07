package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void calculateAreaRect(){
        int length;
        int width;
        Scanner in = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        length = in.nextInt();
        System.out.println("What is the length of the rectangle?");
        width = in.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
