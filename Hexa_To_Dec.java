package in.practice;
import java.util.Scanner;

public class Hexa_To_Dec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Hexa-Decimal Number: ");
        String hexaNumber = sc.next();
        sc.close();

        int decimal = 0;
        int position = 0;

        for(int i = hexaNumber.length()-1; i>=0; i--) {

            // Get the current digit (character) and convert it to integer
            char digitChar = hexaNumber.charAt(i);
            int digit;

            if (Character.isDigit(digitChar)) {
                digit = digitChar - '0'; // Convert '0'-'9' to 0-9
            } else {
                digit = Character.toUpperCase(digitChar) - 'A' + 10; // Convert 'A'-'F' to 10-15
            }

            decimal += digit * Math.pow(16, position);

            position++;
        }
        System.out.println("The Decimal Number is: " + decimal);
    }
}
