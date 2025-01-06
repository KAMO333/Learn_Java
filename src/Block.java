//Exception:
//is coding machanism that is practiced to handle all kinds of errors that could occur
//during the program runtime, it affords us catching all sort of unexpected errors and ensures our program
//never crashes.
//we use try/catch keywords.

//(EXCEPTION E) IS USED TO CATCH ALL KINDS OF ERRORS!

//class Block {
//    public static void main(String[] args) {
//        try {
//            int a[ ] = new int[2];
//            System.out.println(a[4]);
//        } catch (Exception e) {
//            System.out.println("an error occurred");
//        }
//    }
//}

//throw keyword allows us to know what type of error we have encountered, because there a lots of kinds
//of errors to handle or run into.
//it also allows us to customize the error to show and handle
class error {
    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("division by zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42, 0));
    }
}
