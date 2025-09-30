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
}
