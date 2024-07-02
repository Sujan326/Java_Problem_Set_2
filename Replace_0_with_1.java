package in.practice;

import java.util.Scanner;

public class Replace_0_with_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers with 0's: ");
        int num = sc.nextInt();

        int num2 = 0;

        //Main Logic
        if(num == 0) {
            num2 = 1;
        } else {
            while(num > 0) {
                int rem = num% 10;
                if(rem == 0) {
                    rem = 1;
                }
                num = num/10;
                num2 = num2 * 10 + rem;
            }
        }

        //Reversing the number
        int reversedNum2 = 0;
        while(num2 > 0) {
            int rem = num2 % 10;
            reversedNum2 = reversedNum2 * 10 + rem;
            num2 = num2 / 10;
        }
        System.out.println("Modified Number : " + reversedNum2);
    }
}
