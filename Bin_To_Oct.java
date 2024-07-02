package in.practice;

public class Bin_To_Oct {

    public static void main(String[] args) {

        String binaryNumber = "110101";

        // Convert binary string to decimal
        int decimal = Integer.parseInt(binaryNumber, 2);

        // Convert decimal to octal string
        String octalNumber = Integer.toOctalString(decimal);

        System.out.println("The Octal Number is: " +octalNumber);




    }
}
