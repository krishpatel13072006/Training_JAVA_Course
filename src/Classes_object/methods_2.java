package Classes_object;
import java.util.*;

public class methods_2 {

    //Write a function to print the sum of all odd numbers from 1 to n.

    public static int sum_of_oddnum(int n) {

        int sum = 0;
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                sum=sum+i;
            }
        }
        return sum;
    }



    //Write a function which takes in 2 numbers and returns the greater of those two.

    public static int grater_of_three(int a,int b,int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+ " " +" is grater");
            }
            else
            {
                System.out.println(c+ " " +" is grater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" "+"is greater");
            }
            else
            {
                System.out.println(c+ " " +" is grater");
            }
        }
        return 0;
    }




    //Two numbers are entered by the user, x and n. Write a function to
    // find the value of one number raised to the power of another i.e. xn.
    public static void calculate_power(int base,int exponent)
    {
        int result=1;
        for(int i=1;i<=exponent;i++)
        {
            result =result*base;
        }
        System.out.println(result);
    }



    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

        //System.out.print("enter number = ");
        //int a=sc.nextInt();
        //System.out.println(sum_of_oddnum(a));


        /*
        System.out.print("enter value a1 = ");
        int a1=sc.nextInt();
        System.out.print("enter value a2 = ");
        int a2=sc.nextInt();
        System.out.print("enter value a3 = ");
        int a3=sc.nextInt();
        System.out.println(grater_of_three(a1,a2,a3));

         */

        /*
        //Write an infinite loop using do while condition.
        do{
            System.out.println("infinite loop");
        }while(true);

         */


        System.out.print("Enter the value of base : ");
        int x=sc.nextInt();
        System.out.print("Enter the value of exponent : ");
        int x1=sc.nextInt();
        System.out.println(Math.pow(x,x1));
        methods_2.calculate_power(x,x1);




    }
}
