package practice;

public class A {
    private static int number = 1;

    public static int getNumber() {
        int current = number;
        number *= 2;
        return current;
    }
}
