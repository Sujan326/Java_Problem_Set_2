package in.practice;

public class PrimeInRange {

    public static void primeRange(int start, int end) {

        for(int num = start; num <=end; num++) {
            boolean isPrime = true;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {

        primeRange(1, 100);


    }
}
