package recurssion;

public class recursion_Exponent {
//
    //without recursion
    public static int exponent(int base,int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {

            if ( exponent == 0)
            {

                return 1;
            }

            if(base==0)
            {
                return 0;

            }

            result = result * base;

        }
        return result;
    }



    //with recursion method-----
    public static int exponential(int x,int n)
    {
        if( n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }

        return x*(exponential(x,n-1));

    }

    public static void main(String[] args) {


        //System.out.println(exponent(5,2));

        System.out.println(exponential(2,5));
    }
}
