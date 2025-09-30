import component.StringCalculatorUtility;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class StringCalculator {

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
