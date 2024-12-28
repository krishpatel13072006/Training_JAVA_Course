package recurssion;

public class Recursion_part3 {

    public static int sum_natural_numbers(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum_natural_numbers(n-1);
    }

    //another method for printing sum of natural numbers
    public static void print_sum_naturalnumbers(int i,int n,int sum)
    {
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
       sum=sum+i;
      // System.out.println(sum);
       print_sum_naturalnumbers(i+1,n,sum);
        System.out.println(i);

    }

    public static void main(String[] args) {

        //System.out.println(sum_natural_numbers(5));

        print_sum_naturalnumbers(1,5,0);

    }
}
