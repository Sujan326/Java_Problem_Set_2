package in.practice;
import java.util.Scanner;

public class Bin_To_Dec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Binary Number: ");
        String binaryNumber = sc.next();
        sc.close();

        int decimal = 0;
        int position = 0;

        //Traverse from (length-1) to firstElement
        for(int i = binaryNumber.length()-1; i >=0; i--) {

            //Each bit is accessed an then converted to its ASCII value of Integer(ASCII 48)
            int bit = binaryNumber.charAt(i) - '0';

            //Formula
            decimal += bit * Math.pow(2, position);

            position++;
        }
        System.out.println("The Decimal Number is: " + decimal);
    }
}
