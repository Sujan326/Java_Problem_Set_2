package in.practice;

import java.util.Scanner;

public class MaxHandshakes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int person = sc.nextInt();

        int handShake;

        handShake = ((person - 1) * person) / 2;

        System.out.println("The total number of handshakes is: " + handShake);
    }
}
