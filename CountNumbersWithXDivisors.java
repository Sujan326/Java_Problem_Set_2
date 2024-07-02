package in.practice;

import java.util.Scanner;

public class CountNumbersWithXDivisors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int count = 0;

        for(int i = 0; i <= n; i++) {

            int countFactor = 0;

            for(int j = 1; j <= i; j++) {

                if(i % j == 0) {
                    countFactor++;
                }
            }

            if(countFactor == x) {
                count++;
            }
        }

        System.out.println("Number of integers from 1 to " + n + " with exactly " + x + " divisors is: " + count);


    }
}
