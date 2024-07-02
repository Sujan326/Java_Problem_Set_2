package in.practice;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();

        sc.close();

        int count = 0;

        while(digits > 0) {
            int rem = digits % 10;
            count++;
            digits = digits / 10;
        }

        System.out.println("The number of digits entered is: " + count);
    }
}
