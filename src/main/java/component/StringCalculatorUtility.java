package component;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class StringCalculatorUtility {
    /**
     * Adds integers given in a comma-separated string.
     * Returns 0 if input is empty.
     */
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        String delimiter = ",|\\n";
        if (numbers.startsWith("//")) {
            int idx = numbers.indexOf('\n');
            delimiter = Pattern.quote(numbers.substring(2, idx));
            numbers = numbers.substring(idx + 1);
        }
        String[] elements = numbers.split(delimiter);
        int sum = 0;
        for (String el : elements) {
            sum += Integer.parseInt(el);
        }
        return sum;
    }
}