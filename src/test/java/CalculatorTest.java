import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    ICalculator calculator;

    public void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    public void testAdd() {
        assertEquals( 100, calculator.add(90, 10));
        assertEquals( -530, calculator.add(-600, 70));
        assertEquals( 0, calculator.add(Integer.MAX_VALUE, 1));
        assertEquals( 0, calculator.add(Integer.MIN_VALUE, -1));
    }

    public void testSubtract() {
        assertEquals( 80, calculator.subtract(90, 10));
        assertEquals( -670, calculator.subtract(-600, 70));
        assertEquals( 0, calculator.subtract(Integer.MAX_VALUE, -1));
        assertEquals( 0, calculator.subtract(Integer.MIN_VALUE, 1));
    }

    public void testDuplicate() {
        assertEquals(900, calculator.duplicate(90, 10));
        assertEquals(-42000, calculator.duplicate(-600, 70));
        assertEquals(0, calculator.duplicate(Integer.MAX_VALUE, 2));
        assertEquals( 0, calculator.duplicate(Integer.MIN_VALUE, 2));
        assertEquals( 0, calculator.duplicate(1, 0));
    }

    public void testDivide() {
        assertEquals( 9, calculator.divide(90, 10));
        assertEquals( -8, calculator.divide(-600, 70));
        assertEquals( -1073741823, calculator.divide(Integer.MAX_VALUE, -2));
        assertEquals( 1073741824, calculator.divide(Integer.MIN_VALUE, -2));
        assertEquals( 0, calculator.divide(1, 0));
    }
}