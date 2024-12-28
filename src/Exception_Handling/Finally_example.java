package Exception_Handling;

//Finally block is used to write cleanup code or closeup code(for releasing memory,for closing code,for closing file,etc.

public class Finally_example {

    public static void main(String[] args) {

        try
        {
            System.out.println("Try Block");
            System.out.println(23/0);

        }
        catch(ArithmeticException n)
        {
            System.out.println(n);

        }
        finally
        {
            int array[]={12,13,14,15};
            int sum=0;
            for(int i=0;i<array.length;i++)
            {
                sum=sum+array[i];

            }
            System.out.println("Sum = "+sum);

            System.out.println("finally block is followed by try_catch Block");
            System.out.println("compulsory executed if no exception is in finally statement");

        }
    }
}
