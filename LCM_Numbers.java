package in.practice;

import java.util.Scanner;

public class LCM_Numbers {

    public static int GCD(int num1, int num2) {

        //Finding Smallest number from (num1, num2)
        int small = Math.min(num1, num2);

        //Declaring gcd to 1
        int gcd = 1;
        for(int i = 1; i <= small; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void LCM(int num1, int num2) {
        //Finding Max
        int greater = Math.max(num1, num2);

        //LCM Formula : product / gcd
        int product = num1 * num2;
        int gcd = GCD(num1, num2);

        //Finding LCM
        int lcm = product / gcd;

        System.out.println("The LCM of the given numbers is: " + lcm);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        sc.close();

        LCM(num1, num2);




    }
}
