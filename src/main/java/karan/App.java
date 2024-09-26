package karan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    handleSquareRoot(scanner);
                    break;

                case 2:
                    handleFactorial(scanner);
                    break;

                case 3:
                    handleNaturalLog(scanner);
                    break;

                case 4:
                    handlePower(scanner);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Select operation:");
        System.out.println("1. Square Root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural Logarithm (ln)");
        System.out.println("4. Power (x^b)");
        System.out.println("5. Exit");
    }

    private static int getUserChoice(Scanner scanner) {
        int choice = -1; // Initialize to an invalid choice
        while (choice < 1 || choice > 5) {
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        return choice;
    }

    private static void handleSquareRoot(Scanner scanner) {
        System.out.print("Enter number: ");
        double x = scanner.nextDouble();
        if (x < 0) {
            System.out.println("Error: Square root of a negative number is not real.");
        } else {
            System.out.println("Square root of " + x + " is " + Math.sqrt(x));
        }
    }

    private static void handleFactorial(Scanner scanner) {
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Error: Factorial of a negative number is not defined.");
        } else {
            System.out.println("Factorial of " + num + " is " + factorial(num));
        }
    }

    private static void handleNaturalLog(Scanner scanner) {
        System.out.print("Enter number: ");
        double n = scanner.nextDouble();
        if (n <= 0) {
            System.out.println("Error: Natural log is only defined for positive numbers.");
        } else {
            System.out.println("Natural log of " + n + " is " + Math.log(n));
        }
    }

    private static void handlePower(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        System.out.println(base + "^" + exponent + " is " + Math.pow(base, exponent));
    }

    public static long factorial(int num) {
        if (num == 0) return 1;
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
