package in.practice;

import java.util.Scanner;

public class Dec_To_Bin {

    public static void directApproach() {
        int decimal = 7;
        String binaryNumber = Integer.toBinaryString(decimal);
        System.out.println("The Binary Number is: " + binaryNumber);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Decimal Number: ");
        int decimal = sc.nextInt();

        int binary[] = new int[20];
        int index = 0;

        while(decimal > 0) {
            int r = decimal % 2;
            binary[index++] = r;
            decimal /= 2;
        }

        System.out.println("The Binary Number is:");
        for(int j = index-1; j>=0; j--) {
            System.out.print(binary[j] + "");
        }

        //Direct Approach
        System.out.println("\nSolution Using direct approach ");
        directApproach();

    }
}
