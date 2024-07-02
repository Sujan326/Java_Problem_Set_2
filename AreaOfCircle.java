package in.practice;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of radius: ");
        int r = sc.nextInt();

        double area;
        area = Math.PI * (r*r);

        System.out.println("Area of circle is: " + area);


    }
}
