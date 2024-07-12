import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number");
            int x = scanner.nextInt();

            System.out.println("Enter another whole number");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result is " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero, Bro!");
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a whole number, Bro!");
        }
        catch (Exception e) {
        // It's good practice to add [Exception e] to catch any other exceptions not defined
        System.out.println("Something went wrong");
        }
        finally {
        // It's good practice to close scanner or any files that may be opened inside the finally block
        scanner.close();
        }
    }
}