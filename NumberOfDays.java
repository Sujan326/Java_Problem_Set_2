package in.practice;

import java.util.Scanner;

public class NumberOfDays {

    public static boolean leapYear(int year) {

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month: ");
        String month = sc.nextLine();

        switch (month) {
            case "January", "March", "May", "July", "August", "October", "December":
                System.out.println("31 Days");
                break;

            case "February":
                System.out.print("Enter the year: ");
                int year = sc.nextInt();
                if(leapYear(year)) {
                    System.out.println("29 Days");
                } else {
                    System.out.println("28 Days");
                }
                break;

            case "April", "June", "September", "November":
                System.out.println("30 Days");
                break;

            default:
                System.out.println("Invalid Month");
        }
    }
}
