

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        greetUser();
        String name = repeatName();
        int age = guessAge();
        countToAnyNumber();
        programKnowledge();
    }

    public static void greetUser() {
        System.out.println("Hello Human!");
    }

    public static String repeatName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("One more time for me, please");
        name = scanner.nextLine();
        System.out.println("Thank you, " + name + "!");
        return name;
    }
    public static int guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let me guess your age. What year were you born?");
        int birthYear = scanner.nextInt();
        int currentYear = 2023;
        int age = currentYear - birthYear;
        System.out.println("You are " + age + " years old!");
        return age;
    }

    public static void countToAnyNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lets do some counting. What number should we count to? ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void programKnowledge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time to test your skills. What month is it?");
        System.out.println("September");
        System.out.println("July");
        System.out.println("May");
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("September"))
            System.out.println("Sorry, That is incorrect. Please try again");
            if (userInput.equals("July"))
                System.out.println("Sorry, That is incorrect. Please try again");
            if (userInput.equals("May")) {
                System.out.println("That is Correct! You are so smart!");
                break;
            }
        }
    }
}

