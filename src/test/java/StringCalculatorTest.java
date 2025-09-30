import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    @Test
    void testMainFunctionWithValidInput() {
        String input = "1,2\nexit\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        StringCalculator.main(new String[]{});

        String output = out.toString();

        // Assert output contains expected sum
        assertThat(output).contains("Sum: 3");
    }

    @Test
    void testMainFunctionWithInvalidInput() {
        String input = "a,b\nexit\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        StringCalculator.main(new String[]{});

        String output = out.toString();

        assertThat(output).contains("Invalid input format");
    }
}