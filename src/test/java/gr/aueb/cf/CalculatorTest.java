package gr.aueb.cf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoIntegers() {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 20;
        int expectedResult = 30;
        int actualResult = 0;

        actualResult = calc.add(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void subTwoIntegers() {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 20;
        int expectedResult = -10;
        int actualResult = 0;

        actualResult = calc.sub(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divPositiveScenario() throws Exception {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 2;
        int expectedResult = 5;
        int actualResult = 0;

        actualResult = calc.div(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divNegativeScenario() {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 0;

        assertThrows(Exception.class,
                () -> calc.div(a, b));
    }
}