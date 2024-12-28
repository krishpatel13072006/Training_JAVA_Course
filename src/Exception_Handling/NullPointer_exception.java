package Exception_Handling;

public class NullPointer_exception {
    public static void main(String[] args) {

        String name=null;

        try{
            for(int i=0;i<name.length();i++)
            {
                System.out.println("KRISH");
            }

        }
        catch(NullPointerException n)
        {
            System.out.println(n);
            System.out.println("NullPointer exception has occurred");
        }
    }
}
