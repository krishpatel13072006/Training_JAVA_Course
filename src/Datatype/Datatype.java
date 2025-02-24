package Datatype;
import java.util.Scanner;
public class Datatype {
    public void abc(){
        int num=20;
        System.out.println(num*2);
    }

    public static void main(String[] args) {
Datatype d=new Datatype();
d.abc();


        //widening type casting
        //lower data type to higher data type
        byte x=24;
        short v=x;
        System.out.println(v);

        int n=123456;
        double v1=n;
        System.out.println(v1);


        //narrowing type casting
       // higher datatype to lower data type conversion

        float z=1234f;
        long c=(long)z;
        System.out.println(c);

        double w=12334;
        int t=(int)w;
        System.out.println(t);

        char cc='A';
        byte vc=(byte) cc;
        System.out.println(vc);


    }

}
