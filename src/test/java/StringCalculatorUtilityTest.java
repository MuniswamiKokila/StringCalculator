import component.StringCalculatorUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class StringCalculatorUtilityTest {
    @Test
    void returnsZeroForEmptyInput() {
        Assertions.assertEquals(0, new StringCalculatorUtility().add(""));
    }
}
