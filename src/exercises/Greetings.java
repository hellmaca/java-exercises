package exercises;

import java.util.Scanner;

public class Greetings {


    public static void personalGreeting() {
        Scanner in = new Scanner(System.in);

    System.out.println("What's your name?");
    String name = in.nextLine();
    System.out.println("Hello " + name + "!");
}
}
