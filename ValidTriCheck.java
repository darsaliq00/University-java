import java.util.Scanner;

public class ValidateTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        boolean isValidTriangle = isValidTriangle(side1, side2, side3);

        if (isValidTriangle) {
            System.out.println("valid triangle.");
        } else {
            System.out.println("Invalid triangle.");
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
