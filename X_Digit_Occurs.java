package in.practice;
import java.util.Scanner;

public class X_Digit_Occurs {

    public static void usingArrays(Scanner sc) {

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        //Adding Elements
        System.out.println("Enter the array elements");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of X: ");
        int x = sc.nextInt();

        int count = 0;

        //Printing Elements
        for(int val : arr) {
            System.out.print(val + " ");

            if(val == x) {
                count++;
            }
        }

        System.out.println("\nThe number " + x + " is found " + count +" times");

    }

    public static void directMethod(Scanner sc) {
        System.out.print("Enter the digits: ");
        int digits = sc.nextInt();

        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        int count = 0;
        while(digits > 0) {
            int rem = digits % 10;
            if(rem == x) {
                count++;
            }
            digits /= 10;
        }
        System.out.println("\nThe number " + x + " is found " + count +" times");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //usingArrays(sc);

        directMethod(sc);









    }
}
