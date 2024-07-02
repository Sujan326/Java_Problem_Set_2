package in.practice;

import java.util.Scanner;

public class AddingTwoFractions {

    public static int gcd(int a, int b) {

        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numerator and denominator of first fraction: ");
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        System.out.println("First Fraction " + "(" + n1 + " / " + d1 + ")");

        System.out.println("Enter the numerator and denominator of second fraction: ");
        int n2 = sc.nextInt();
        int d2 = sc.nextInt();
        System.out.println("Second Fraction " + "(" + n2 + " / " + d2 + ")");

        sc.close();

        int newNumerator =  ( n1 * d2 ) + ( d1 * n2 );
        int newDenominator = d1 * d2;

        int gcd = gcd(newNumerator, newDenominator);

        System.out.println("The sum of the given fraction is: " + ( newNumerator / gcd ) + "/" + ( newDenominator / gcd));
    }
}
