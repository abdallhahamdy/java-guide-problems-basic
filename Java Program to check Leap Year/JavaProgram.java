import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter any Year:");
            int year = scanner.nextInt();
            boolean isLeap = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        isLeap = true;
                    else
                        isLeap = false;
                } else
                    isLeap = true;
            } else {
                isLeap = false;
            }

            if (isLeap == true) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
