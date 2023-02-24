package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        String gameNumber = userInput();
        System.out.println("Your choice: " + gameNumber);
        System.out.println(" ");
        Engine.general(gameNumber);
    }
    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
