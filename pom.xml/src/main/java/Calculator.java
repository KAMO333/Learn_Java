public class Calculator {

    // Adds two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtracts second number from first
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Divides first number by second
    // Throws ArithmeticException if b is 0
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // Checks if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Returns the maximum of two numbers
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    // Calculates factorial of a number
    // Throws IllegalArgumentException for negative input
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Checks if a string is a palindrome
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}