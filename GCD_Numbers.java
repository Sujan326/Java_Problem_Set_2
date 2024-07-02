// 1.Java Program to find GCD or HCF of two numbers

package in.practice;
import java.util.Scanner;

public class GCD_Numbers {

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
        System.out.println("The GCD of the given number is: " + gcd);
        return gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        sc.close();

        GCD(num1, num2);






    }
}
