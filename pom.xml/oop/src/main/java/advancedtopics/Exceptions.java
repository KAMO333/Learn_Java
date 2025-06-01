package advancedtopics;

public class Exceptions {
    static int div(int a, int b) throws ArithmeticException {
        if(a == 0 || b == 0 ) {
            throw new ArithmeticException("Cant divide by zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
//        System.out.println(div(10, 0));
//        System.out.println(div(0, 10));
        System.out.println(div(150, 10));
    }
}
