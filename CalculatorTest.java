import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;

import javax.print.attribute.IntegerSyntax;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class CalculatorTest {


    @Test
    public void addTest() {
        int result = MathMethods.add(4, 2);
        assertEquals(6, result);
    }

    @Test
    public void divTest() {
        int result = MathMethods.div(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void subTest() {
        int result = MathMethods.sub(8, 2);
        assertEquals(6, result);
    }

    @Test
    public void multiTest() {
        int result = MathMethods.multi(6, 7);
        assertEquals(42, result);
    }

    @Test
    public void DivOtherTest() {
        int result = MathMethods.div(6, 3);
        assertEquals(2, result);

    }

    @Test
    public void throwsArithmeticException() {
        try {
            MathMethods.div(6, 0);

            fail("should throw an exception");
        } catch (ArithmeticException e) {

            assertThat(e.getMessage(), containsString("/ by zero"));
            assertThat(e, instanceOf(ArithmeticException.class));

        }
    }
}