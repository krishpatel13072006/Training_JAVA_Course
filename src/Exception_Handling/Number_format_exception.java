package Exception_Handling;

public class Number_format_exception {
    public static void main(String[] args) {

        //only number type string can be converted into integer type;
        String name = "123";


        try {
            //parseInt is method of integer class used to convert string into integer data type;
            int x = Integer.parseInt(name);
            System.out.println(x);
        } catch (NumberFormatException n) {
            System.out.println(n);
        }
        System.out.println("NumberFormatException");
        System.out.println("main method terminated");
    }
}
