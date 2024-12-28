package Exception_Handling;
/*
throws keyword is used when we don't want to handle the exception and try to pass that exception to jvm or other method
explicitly
*/

public class Throws_example {

    public void division(int a,int b) throws ArithmeticException
    {
        if(b>=0)
        {
            throw new ArithmeticException();
        }
        else
        {
            System.out.println(a/b);
        }
    }
    public static void main(String[] args) {

        Throws_example obj=new Throws_example();

        try
        {
          obj.division(10,0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("value of b is 0 or less than 0 ");
        }
    }
}
