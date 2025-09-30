package component;

import org.springframework.stereotype.Component;

@Component
public class StringCalculatorUtility {
    /**
     * Adds integers given in a comma-separated string.
     * Returns 0 if input is empty.
     */
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        else if (!numbers.contains(",")) return Integer.parseInt(numbers);
        throw new UnsupportedOperationException();
    }
}