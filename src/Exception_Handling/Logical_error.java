package Exception_Handling;

public class Logical_error {

    public static void main(String[] args) {

try {
    // this will give Arithmetic exception due to logical error in code---
    int x[] = {10, 20, 30, 40};
    int y[] = {2, 3, 0, 2};

    for (int i = 0; i <= x.length; i++) {
        System.out.println((x[i] / y[i]));
    }
}catch(ArithmeticException e)
{
    System.out.println(e);
    System.out.println("Arithmetic exception occurred");

}
    }
}
