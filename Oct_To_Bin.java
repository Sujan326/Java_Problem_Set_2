package in.practice;

public class Oct_To_Bin {

    public static void main(String[] args) {

        String octalNumber = "65";

        //Converting octalNumber to decimal
        int decimal = Integer.parseInt(octalNumber, 8);

        //Converting decimal to binaryNumber
        String binaryNumber = Integer.toBinaryString(decimal);

        System.out.println("The Binary Number is: " +binaryNumber);




    }
}
