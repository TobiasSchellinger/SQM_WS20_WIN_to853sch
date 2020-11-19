public interface ICalculator {

    /**
     * Calculates the Addition of two Values and returns the Result.
     * @param a First Value
     * @param b Second Value
     * @return Result
     */
    public int add(int a, int b);

    /**
     * Calculates the Subtraction of two Values and returns the Result.
     * @param a First Value
     * @param b Second Value
     * @return Result
     */
    public int subtract(int a, int b);

    /**
     * Calculates the Duplication of two Values and returns the Result.
     * @param a First Value
     * @param b Second Value
     * @return Result
     */
    public int duplicate(int a, int b);

    /**
     * Calculates the Division of two Values and returns the Result.
     * @param a First Value
     * @param b Second Value
     * @return Result
     */
    public int divide(int a, int b);

}
