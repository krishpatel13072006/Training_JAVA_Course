package Myjava;
import java.util.Scanner;
public class volume_sqaure {

    Scanner sc=new Scanner(System.in);
    float radius= sc.nextFloat();

    float height=sc.nextFloat();


    public void volume()
    {
        float volume= (float) (3.14*radius*radius*height);
        System.out.println(volume);
    }



    public static void main(String[] args) {

        volume_sqaure a=new volume_sqaure();
        a.volume();
    }
}
