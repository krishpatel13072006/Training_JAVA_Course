package Classes_object;

import java.util.Scanner;

public class methods {



    public static void factorial(int n)
    {
        int factor=1;
        for(int i=n;i>=1;i--)
        {
            if(n<0){
                System.out.println("negative number");
                return;
            }
            factor=factor*i;
        }

        System.out.println(factor);
    }




    public static void array(int arr[])
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
        return;
    }






    public static void factor(int n)
    {
        int hfactor=1;
        for(int i=n-1;i>1;i--)
        //for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                //System.out.println(i);//print all the factors of numbers
                hfactor = i;
                break;// no use in case of another method
            }

        }
        System.out.println(hfactor);
    }





    public static String upperfunction(String str) {
        return str.trim().toUpperCase();
    }





    public static int summation(int a, int b) {
        return a + b;
    }




//Enter 3 numbers from the user & make a function to print their average
    public static int average(int a, int b, int c) {
        int avg=((a + b + c)/3);
        return avg;
    }






    public static void isprime(int n) {
        int result=0;
        for (int i = 1; i<=n; i++) {
            if (n % i == 0) {
                result++;
            }
        }
        if(result==2){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        }

    }






    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int x[]={1,2,3,4,5};
       // methods.array(x);

        System.out.println("---------------------------------------");

        int z[]={1,2,3,4,5,6,7,8,9,10};
        //methods.array(z);

        System.out.println("---------------------------------------");


        String strrr=" krish    patel ";
        String n= methods.upperfunction(strrr);
        //System.out.println(n);

        System.out.println("---------------------------------------");


        int f= methods.summation(10,10);
       //System.out.println(f);

        System.out.println("---------------------------------------");


        int h=methods.average(10,10,10);
       System.out.println(h);

        System.out.println("---------------------------------------");


        //System.out.println("Enter number :");
        //int num= sc.nextInt();

        System.out.println("---------------------------------------");


        // methods.isprime(num);

        System.out.println("---------------------------------------");


       // System.out.print("Enter number :");
        int number= sc.nextInt();
        //factor(number);


        System.out.println("---------------------------------------");


       // System.out.print("enter  number = ");
        int j=sc.nextInt();
       // methods.factorial(j);

        sc.close();



    }
}
