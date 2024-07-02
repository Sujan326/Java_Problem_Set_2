package in.practice;
import java.util.Scanner;

public class OccupySeats {

    // Function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Function to calculate permutation P(n, r)
    public static int permutation(int n, int r) {
        if (n < r) {
            return 0;
        }
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int student = sc.nextInt();

        System.out.print("Enter the number of seats: ");
        int seats = sc.nextInt();

        sc.close();

        int results = permutation(seats, student);
        System.out.println("Number of permutations of " + student + " students in " + seats + " seats: " + results);
    }
}
