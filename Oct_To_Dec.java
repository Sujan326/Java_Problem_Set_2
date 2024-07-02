//5.Octal to Decimal conversion

package in.practice;

import java.util.Scanner;

public class Oct_To_Dec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Octal Number: ");
        String octalNumber = sc.next();
        sc.close();

        int decimal = 0;
        int position = 0;

        for(int i = octalNumber.length()-1; i >= 0; i--) {

            int bit = octalNumber.charAt(i) - '0';

            decimal += bit * Math.pow(8, position);

            position++;
        }
        System.out.println("The Decimal Number is: " + decimal);

    }
}
