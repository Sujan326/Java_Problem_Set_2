package in.practice;

public class Dec_To_Oct {

    public static void directApproach() {
        int decimal = 148;
        String octalNumber = Integer.toOctalString(decimal);
        System.out.println("The Octal Number is: " + octalNumber);
    }

    public static void main(String[] args) {

        int decimal = 148;

        int octal[] = new int[20];
        int i = 0;

        while(decimal > 0) {
            int r = decimal % 8;
            octal[i++] = r;
            decimal = decimal / 8;
        }

        System.out.println("The Octal Number is:");
        for(int j = i-1; j >= 0; j--) {
            System.out.print(octal[j] + "");
        }

        //Direct Approach
        System.out.println("\nSolution Using direct approach ");
        directApproach();

    }
}
