package Exception_Handling;

public class Try_catch_2 {
    public static void example() {
        try {
            int x[] = {12, 23, 34, 45};
            int y[] = {10, 10, 0, 10};

            for (int i = 0; i < x.length; i++) {
                System.out.println(x[i] / y[i]);
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
    public static void main(String[] args) {

        example();
    }
}
