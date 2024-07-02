package in.practice;
import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        // Calculate the determinant
        double determinant = (b * b) - (4 * a * c);

        // Determine the roots based on the value of the determinant
        if (determinant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (determinant == 0) {
            // One real root (repeated root)
            double root = -b / (2 * a);
            System.out.println("Roots are real and repeated.");
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("Roots are complex and distinct.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        sc.close();
    }
}
