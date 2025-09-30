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
        String[] elements = numbers.split(",");
        int sum = 0;
        for (String el : elements) {
            sum += Integer.parseInt(el);
        }
        return sum;
    }
}