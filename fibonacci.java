/**
 * <p>
 * CEN 4802C Assignment 2
 * </p>
 * <p>
 * Implement a Java class that contains two methods:
 * </p>
 * <p>
 * A recursive static method that returns the nth term in the Fibonacci sequence.
 * The method should accept n as a parameter. Do not include javadoc code in your
 * implementation (yet).
 * </p>
 * A main method that calls the first method. Pass in 10 as an argument. Output the
 * 10th term of the Fibonacci sequence along with some descriptive text, e.g. "The
 * nth term of the Fibonacci sequence is y." Don't hard-code the results; output
 * the appropriate variables.
 * </p>
 * @author Raymond Ynoa
 */

public class fibonacci {

    /**
     * Output the nth term of the Fibonacci sequence.
     *
     * @param n Input for the Fibonacci sequence.
     * @return Fibonacci sequence utilizing recursive algorithm.
     */
    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Input:\t" + n);
        System.out.println("The nth term of the Fibonacci sequence is " + fibonacciRecursive(n) + ".");
    }
}
