public class BasicOperations
{
    public static int basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+": return v1 + v2;
            case "-": return v1 - v2;
            case "*": return v1 * v2;
            case "/": return v1 / v2;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

}
