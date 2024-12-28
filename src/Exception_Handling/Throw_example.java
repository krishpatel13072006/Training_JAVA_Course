package Exception_Handling;

//Throw keyword is used to throw used defined or custom exception object explicitly to JVM

// syntax:-- horw new ExceptionName("Stirng args")

public class Throw_example  {

    public static void divide(int a, int b) {
        if (b >= 0) {
            throw new ArithmeticException("cannot be used as divisor choose number greater than 0");
        } else {
            System.out.println(a / b);
        }
    }

    public static void main(String args[]) {

            divide(10, 0);

    }
}
