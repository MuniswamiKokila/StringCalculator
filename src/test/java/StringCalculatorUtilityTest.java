import component.StringCalculatorUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class StringCalculatorUtilityTest {
    @Test
    void returnsZeroForEmptyInput() {
        Assertions.assertEquals(0, new StringCalculatorUtility().add(""));
    }

    @Test
    void returnsOneForSingleNumber() {
        Assertions.assertEquals(1, new StringCalculatorUtility().add("1"));
    }

    @Test
    void returnsSumForTwoNumbers() {
        Assertions.assertEquals(3, new StringCalculatorUtility().add("1,2"));
    }

    @Test
    void supportsManyNumbers() {
        Assertions.assertEquals(15, new StringCalculatorUtility().add("1,2,3,4,5"));
    }

    @Test
    void supportsCommaAndNewlineDelimiters() {
        Assertions.assertEquals(6, new StringCalculatorUtility().add("1\n2,3"));
    }

    @Test
    void supportsCustomDelimiter() {
        Assertions.assertEquals(3, new StringCalculatorUtility().add("//;\n1;2"));
    }

    @Test
    void throwsExceptionForNegatives() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new StringCalculatorUtility().add("-2,3,-5"));
        Assertions.assertTrue(ex.getMessage().contains("negative numbers not allowed"));
        Assertions.assertTrue(ex.getMessage().contains("-2"));
        Assertions.assertTrue(ex.getMessage().contains("-5"));
    }


}
