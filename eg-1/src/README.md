Here is the README documentation for your code:

# Exception Handling in Java

This project demonstrates basic exception handling in Java. It includes handling of `ArithmeticException`, `InputMismatchException`, and a generic `Exception` with a `finally` block to ensure resources are properly closed.

## Code Explanation

### Main Class

```java
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
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero, Bro!");
        } catch (InputMismatchException e) {
            System.out.println("That's not a whole number, Bro!");
        } catch (Exception e) {
            // It's good practice to add [Exception e] to catch any other exceptions not defined
            System.out.println("Something went wrong");
        } finally {
            // It's good practice to close scanner or any files that may be opened inside the finally block
            scanner.close();
        }
    }
}
```

### Explanation

1. **Scanner Initialization:**
    ```java
    Scanner scanner = new Scanner(System.in);
    ```
    A `Scanner` object is created to read input from the user.

2. **Try Block:**
    ```java
    try {
        System.out.println("Enter a whole number");
        int x = scanner.nextInt();

        System.out.println("Enter another whole number");
        int y = scanner.nextInt();

        int z = x / y;

        System.out.println("Result is " + z);
    }
    ```
    - Prompts the user to enter two whole numbers.
    - Performs division of the two numbers.
    - Prints the result of the division.

3. **Catch Blocks:**
    - **ArithmeticException:**
        ```java
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero, Bro!");
        }
        ```
        Catches the exception when a division by zero occurs.

    - **InputMismatchException:**
        ```java
        catch (InputMismatchException e) {
            System.out.println("That's not a whole number, Bro!");
        }
        ```
        Catches the exception when the user input is not a whole number.

    - **Generic Exception:**
        ```java
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        ```
        Catches any other exceptions that are not explicitly caught by previous catch blocks.

4. **Finally Block:**
    ```java
    finally {
        scanner.close();
    }
    ```
    Ensures that the `Scanner` object is closed, releasing any resources it may be holding.

## How to Run

1. Compile the `Main.java` file using the following command:
    ```bash
    javac Main.java
    ```

2. Run the compiled class:
    ```bash
    java Main
    ```

3. Follow the prompts to enter whole numbers and observe how different exceptions are handled.

This project is a simple demonstration of exception handling in Java, showing how to handle specific exceptions as well as a generic exception, and ensuring proper resource management with a `finally` block.