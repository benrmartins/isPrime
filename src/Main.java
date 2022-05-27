import java.util.Scanner;

public class Main {
    int num1;
    int num2;

    public static boolean isPrime(int num1) {
        boolean prime = true;
        for(int i = 2; i < num1; i++) {
            if(num1 % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void findPrime(int num1, int num2) {
        for (int i = num1 + 1; i <= num2; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        // takes in the first number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scan.nextInt();
        if(isPrime(input)) {
            System.out.println("This number is prime.");
        } else {
            System.out.println("This number is not prime.");
        }


        // takes in the second number
        System.out.println("Enter another number: ");
        int in = scan.nextInt();

        if(isPrime(in)) {
            System.out.println("This number is prime.");
        } else {
            System.out.println("This number is not prime.");
        }

        System.out.println("Prime numbers between " + input + " and " + in);

        findPrime(input, in);
    }
}