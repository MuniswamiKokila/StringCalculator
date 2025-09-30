import component.StringCalculatorUtility;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

/**
 * Spring Boot application entry point for String Calculator.
 *
 * Handles dynamic user input from console; delegates sum calculation
 * to StringCalculatorUtility. Continues until 'exit' is typed.
 *
 * Prints results or descriptive error messages for invalid inputs.
 *
 * This class does not contain business logic; separation of concerns is maintained.
 */
@SpringBootApplication
public class StringCalculator {

    /**
     * Main method - runs interactive command-line loop with users.
     *
     * @param args standard main args, not used here.
     */
    public static void main(String[] args) {
        StringCalculatorUtility calculator = new StringCalculatorUtility();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers or 'exit' to quit:");
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) break;
            try {
                System.out.println("Sum: " + calculator.add(input));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
