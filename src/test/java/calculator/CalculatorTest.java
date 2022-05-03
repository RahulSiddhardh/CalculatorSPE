package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void addingTruePositive(){
        assertEquals("Adding two integer numbers for True Positive", 4, calculator.add(2, 2), DELTA);
        assertEquals("Adding two double numbers for True Positive", 5.3, calculator.add(2.1, 3.2), DELTA);
    }

    @Test
    public void addingFalsePositive(){
        assertNotEquals("Adding two integer numbers for False Positive", 6, calculator.add(2, 2), DELTA);
        assertNotEquals("Adding two double numbers for False Positive", 7.3, calculator.add(2.1, 3.2), DELTA);
    }

    @Test
    public void subtractingTruePositive(){
        assertEquals("Subtracting two integer numbers for True Positive", 0, calculator.subtract(2, 2), DELTA);
        assertEquals("Subtracting two double numbers for True Positive", -1.1, calculator.subtract(2.1, 3.2), DELTA);
    }

    @Test
    public void subtractingFalsePositive(){
        assertNotEquals("Subtracting two integer numbers for False Positive", 6, calculator.subtract(2, 2), DELTA);
        assertNotEquals("Subtracting two double numbers for False Positive", -7.3, calculator.subtract(2.1, 3.2), DELTA);
    }

    @Test
    public void multiplyingTruePositive(){
        assertEquals("Multiplying two integer numbers for True Positive", 15, calculator.multiply(5, 3), DELTA);
        assertEquals("Multiplying two double numbers for True Positive", 5.5, calculator.multiply(2.5, 2.2), DELTA);
    }

    @Test
    public void multiplyingFalsePositive(){
        assertNotEquals("Multiplying two integer numbers for False Positive", 18, calculator.multiply(5, 3), DELTA);
        assertNotEquals("Multiplying two double numbers for False Positive", 9.5, calculator.multiply(2.5, 2.2), DELTA);
    }
//
    @Test
    public void dividingTruePositive(){
        assertEquals("Dividing two integer numbers for True Positive", 2, calculator.divide(10, 5), DELTA);
        assertEquals("Dividing two double numbers for True Positive", 2.25, calculator.divide(5.4, 2.4), DELTA);
    }

    @Test
    public void dividingFalsePositive(){
        assertNotEquals("Dividing two integer numbers for False Positive", 7, calculator.divide(10, 5), DELTA);
        assertNotEquals("Dividing two double numbers for False Positive", 1.95, calculator.divide(5.4, 2.4), DELTA);
    }


}
