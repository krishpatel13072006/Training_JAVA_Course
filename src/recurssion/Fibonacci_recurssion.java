package recurssion;

public class Fibonacci_recurssion {

    public static int recursion(int a,int b,int n)
    {
     if(n==0)
     {
         return 1;
     }
     int c=a+b;
     System.out.println(c);
     return recursion(b,c,n-1);
    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=10;
        recursion(a,b,n-2);
    }
}
