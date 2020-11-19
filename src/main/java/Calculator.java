import org.graalvm.compiler.hotspot.stubs.DivisionByZeroExceptionStub;

public class Calculator implements ICalculator {

    IllegalArgumentException IntOutOfBound = new IllegalArgumentException("Resulting Integer is Outside of the Integer Number Range");
    IllegalArgumentException DivisionByZero = new IllegalArgumentException("Division by Zero");

    /**
     * Calculates the Addition of two Values and returns the Result.
     *
     * @param a int First Value
     * @param b int Second Value
     * @return int
     */
    @Override
    public int add(int a, int b) {
        int result = 0;
        try {
            long outOfBoundsTest = (long) a + (long) b;
            if (outOfBoundsTest > Integer.MAX_VALUE || outOfBoundsTest < Integer.MIN_VALUE) {
                throw IntOutOfBound;
            }
            result = a + b;
            return result;
        }
        catch(IllegalArgumentException e) {
            System.out.println(e+": a = "+a+", b = "+b);
            return result;
        }
    }

    /**
     * Calculates the Subtraction of two Values and returns the Result.
     *
     * @param a int First Value
     * @param b int Second Value
     * @return int+
     */
    @Override
    public int subtract(int a, int b) {
        int result = 0;
        try {
            long outOfBoundsTest = (long) a - (long) b;
            if (outOfBoundsTest > Integer.MAX_VALUE || outOfBoundsTest < Integer.MIN_VALUE) {
                throw IntOutOfBound;
            }
            result = a - b;
            return result;
        }
        catch(IllegalArgumentException e) {
            System.out.println(e+": a = "+a+", b = "+b);
            return result;
        }
    }

    /**
     * Calculates the Duplication of two Values and returns the Result.
     *
     * @param a int First Value
     * @param b int Second Value
     * @return int
     */
    @Override
    public int duplicate(int a, int b) {
        int result = 0;
        try {
            long outOfBoundsTest = (long) a * (long) b;
            if (outOfBoundsTest > Integer.MAX_VALUE || outOfBoundsTest < Integer.MIN_VALUE) {
                throw IntOutOfBound;
            }
            result = a * b;
            return result;
        }
        catch(IllegalArgumentException e) {
            System.out.println(e+": a = "+a+", b = "+b);
            return result;
        }
    }

    /**
     * Calculates the Division of two Values and returns the Result.
     *
     * @param a int First Value
     * @param b int Second Value
     * @return int
     */
    @Override
    public int divide(int a, int b) {
        int result = 0;
        try {
            if (b == 0) {
                throw DivisionByZero;
            }
            long outOfBoundsTest = (long) a / (long) b;
            if (outOfBoundsTest > Integer.MAX_VALUE) {
                throw IntOutOfBound;
            }
            result = a / b;
            return result;
        } catch (IllegalArgumentException e) {
            System.out.println(e + ": a = " + a + ", b = " + b);
            return result;
        }
    }
}
