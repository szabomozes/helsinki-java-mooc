
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        if (number == 0) {
            System.out.println("Factorial: " + factorial);
        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial: " + factorial);
        }

    }
}
