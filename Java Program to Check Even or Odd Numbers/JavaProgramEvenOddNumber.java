import java.util.Scanner;

public class JavaProgramEvenOddNumber {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Read number from user
            System.out.println("Enter Number: ");
            int number = sc.nextInt();
            /*
             * If number is divisible by 2 then it's an even number else odd number
             */
            if (number % 2 == 0) {
                System.out.println("The number " + number + " is even");
            } else {
                System.out.println("The number " + number + " is odd");
            }
        }
    }
}
