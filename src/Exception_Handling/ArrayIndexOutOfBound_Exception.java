package Exception_Handling;

public class ArrayIndexOutOfBound_Exception {


    public static void array(){

        try {
            int a[] = {10, 11, 12, 13, 14};
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException n)
        {
            System.out.println(n);
        }
        System.out.println("ArrayIndexOutOfBoundsException has occurred");
    }
    public static void main(String[] args) {

        array();

    }
}
