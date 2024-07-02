package in.practice;
import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 999) {
            int thousands = number / 1000;
            int remainder = number % 1000;
            System.out.println("Thousands part: " + thousands);
            System.out.println("Remainder part: " + remainder);
            display(thousands);
            display(remainder);
        } else {
            display(number);
        }

        sc.close();
    }

    public static void display(int num) {
        if (num == 0) {
            System.out.println("Zero");
            return;
        }

        String[] units = {
                "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        StringBuilder word = new StringBuilder();

        if (num / 100 > 0) {
            word.append(units[num / 100]).append(" Hundred ");
            num %= 100;
        }

        if (num > 0) {
            if (num < 20) {
                word.append(units[num]);
            } else {
                word.append(tens[num / 10]);
                if (num % 10 > 0) {
                    word.append(" ").append(units[num % 10]);
                }
            }
        }

        System.out.println(word.toString().trim());
    }
}
