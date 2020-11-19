public class Calculator implements ICalculator {

    IllegalArgumentException IntOutOfBound = new IllegalArgumentException("Resulting Integer is Outside of the Integer Number Range");

    /**
     * Calculates the Addition of two Values and returns the Result.
     *
     * @param a First Value
     * @param b Second Value
     * @return Result
     */
    @Override
    public int add(int a, int b) {
        int result = 0;
        long outOfBoundsTest = (long) a + (long) b;

        try {
            if (outOfBoundsTest > Integer.MAX_VALUE || outOfBoundsTest < Integer.MIN_VALUE) {
                throw IntOutOfBound;
            } else {
                result = a + b;
                return result;
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println(e+": a = "+a+", b = "+b);
            return 0;
        }
    }

    /**
     * Calculates the Subtraction of two Values and returns the Result.
     *
     * @param a First Value
     * @param b Second Value
     * @return Result
     */
    @Override
    public int subtract(int a, int b) {
        int result = 0;
        long outOfBoundsTest = (long) a - (long) b;

        try {
            if (outOfBoundsTest > Integer.MAX_VALUE || outOfBoundsTest < Integer.MIN_VALUE) {
                throw IntOutOfBound;
            } else {
                result = a - b;
                return result;
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println(e+": a = "+a+", b = "+b);
            return 0;
        }
    }

    /**
     * Calculates the Duplication of two Values and returns the Result.
     *
     * @param a First Value
     * @param b Second Value
     * @return Result
     */
    @Override
    public int duplicate(int a, int b) {
        int result = 0;
        long outOfBoundsTest = (long) a * (long) b;

        try {
            if (outOfBoundsTest > Integer.MAX_VALUE || outOfBoundsTest < Integer.MIN_VALUE) {
                throw IntOutOfBound;
            } else {
                result = a * b;
                return result;
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println(e+": a = "+a+", b = "+b);
            return 0;
        }
    }

    /**
     * Calculates the Division of two Values and returns the Result.
     *
     * @param a First Value
     * @param b Second Value
     * @return Result
     */
    @Override
    public int divide(int a, int b) {
        int result = 0;
        try
        long outOfBoundsTest = (long) a / (long) b;

        try {
            if (outOfBoundsTest > Integer.MAX_VALUE || outOfBoundsTest < Integer.MIN_VALUE) {
                throw IntOutOfBound;
            } else {
                result = a + b;
                return result;
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println(e+": a = "+a+", b = "+b);
            return 0;
        }
    }
}
