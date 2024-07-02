package in.practice;

import java.util.Scanner;

public class SumOfTwoPrime {

    public static boolean primeCheck(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int flag = 0;

        for(int i = 2; i <= num/2; i++) {

            if(primeCheck(i) && primeCheck(num - i)) {
                System.out.println(i + " " + (num - i));
                flag = 1;
            }
        }
        if(flag == 0) {
            System.out.println("Not Possible");
        }
    }
}
