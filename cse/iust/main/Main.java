package cse.iust.main;

import cse.iust.math.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Input second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Perform operations using Calculator methods
        int sum = calculator.addition(num1, num2);
        int difference = calculator.subtraction(num1, num2);
        int product = calculator.multiplication(num1, num2);
        double quotient = calculator.division(num1, num2);

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}
