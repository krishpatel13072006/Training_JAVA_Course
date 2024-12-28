package Exception_Handling;

public class Try_Catch_Exmaple {

    public static int divide(int a,int b)
    {
        return a/b;
    }

    public static void main(String[] args) {

        try
        {
           int x[]= {12,23,34,45};
           int y[]={10,10,0,10};
           for(int i=0;i<x.length;i++)
           {
               int t = Try_Catch_Exmaple.divide(x[i], y[i]);
               System.out.println(t);
           }

        }catch(Exception b)
        {
           // b.printStackTrace();// print exception name,description,stack trace

            System.out.println(b.getMessage());//gives only the message of exception that has been occurred

            System.out.println(b.toString());//exception name with its description
        }
    }
}
