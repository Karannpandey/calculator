package karan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testSquareRoot() {
        // Test positive number
        assertEquals(2.0, Math.sqrt(4), 0.001);
        
        // Test zero
        assertEquals(0.0, Math.sqrt(0), 0.001);
        
        // Test negative number (should return NaN)
        assertTrue(Double.isNaN(Math.sqrt(-4)));
    }

    @Test
    public void testFactorial() {
        // Test factorial of 0
        assertEquals(1, App.factorial(0));

        // Test factorial of positive number
        assertEquals(120, App.factorial(5));

        // Test factorial of larger number
        assertEquals(3628800, App.factorial(10));
    }

    @Test
public void testNaturalLogarithm() {
    // Test natural logarithm of 1 (ln(1) = 0)
    assertEquals(0.0, Math.log(1), 0.001);

    // Test natural logarithm of e (ln(e) = 1)
    assertEquals(1.0, Math.log(Math.E), 0.001);

    // Correctly assert ln(10)
    double expectedLog10 = 2.302585092994046;
    double actualLog10 = Math.log(10);
    
    // System.out.println("Actual log(10) value: " + actualLog10); // Debugging line
    assertEquals(expectedLog10, actualLog10, 0.0000001); // Updated precision
}




    @Test
    public void testPower() {
        // Test base^exponent
        assertEquals(8.0, Math.pow(2, 3), 0.001);
        
        // Test base^0 = 1
        assertEquals(1.0, Math.pow(5, 0), 0.001);

        // Test negative base with positive exponent
        assertEquals(9.0, Math.pow(-3, 2), 0.001);

        // Test negative exponent
        assertEquals(0.25, Math.pow(2, -2), 0.001);
    }
}
