package Classes_object;
import java.util.*;

public class Fibonacci_series {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1;
        int n3;
        System.out.print("enter the number of count = ");
        int count=sc.nextInt();
        System.out.println(n1+" "+n2);

        for(int i=2;i<=count;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }


    }
}
