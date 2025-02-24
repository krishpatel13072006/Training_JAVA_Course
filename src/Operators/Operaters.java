package Operators;

public class Operaters {

    public static void main(String[] args) {
        System.out.println("________________arithematic operators________________");
        int a=9;
        int b=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println();
        System.out.println("________________logical operators________________");
        int a1=23;
        int a2=24;
        int a3=35;
        System.out.println((a1!=a2 && a2!=20));
        System.out.println((a1==23 || a2==24 ));
        System.out.println((a1!=a2));
        System.out.println();
        System.out.println("________________increment/decrement operators________________");
        int b1=23;
        System.out.println(b1++);//value is first printed and then incremented
        System.out.println(++b1);//value is first incremented and then printed
        int b2=20;
        System.out.println(b2--);//value is first printed and then decremented
        System.out.println(--b2);//value is first decremented and then printed
        System.out.println();
        System.out.println("________________relational operators________________");
        int x1=23;
        int x2=24;
        System.out.println((x1 > x2));
        System.out.println((x1 < x2));
        System.out.println((x1 >= x2));
        System.out.println((x1 <= x2));
        System.out.println((x1 == x2));
        System.out.println((x1 != x2));
        System.out.println();
        System.out.println("________________Assignment operators________________");
        int n1=2;
        System.out.println(n1=2);
        System.out.println(n1+=2);
        System.out.println(n1-=2);
        System.out.println(n1*=2);
        System.out.println(n1/=2);
        System.out.println(n1%=2);
        System.out.println(n1^=2);
        System.out.println(n1&=2);
        System.out.println(n1>>=2);
        System.out.println(n1<<=2);
        System.out.println();
        System.out.println("________________Ternary operators________________");
        int s1=57006;
        int s2=23097;
        int s3=4908;
        int max=(s1>s2 &&  s1>s3)?s1:((s2>s3)?s2:s3);
        System.out.println(max);
        int min=(s1<s2)?s1:s2;
        System.out.println(min);

    }
}
