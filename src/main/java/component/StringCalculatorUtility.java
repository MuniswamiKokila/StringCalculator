package component;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * TDD String Calculator supporting delimiter options and robust negative value handling.
 * Author: Muniswami Kokila
 */

public class StringCalculatorUtility {

    public StringCalculatorUtility() {
    }

    /**
     * Adds numbers in a string using configurable delimiters.
     *
     * @param numbers The input string of numbers.
     * @return The sum.
     * @throws IllegalArgumentException if negative numbers present.
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
        List<Integer> negatives = new ArrayList<>();
        for (String element : elements) {
            try {
                int num = Integer.parseInt(element);
                if (num < 0) negatives.add(num);
                else sum += num;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid input format");
            }
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed " + negatives);
        }
        return sum;
    }
}