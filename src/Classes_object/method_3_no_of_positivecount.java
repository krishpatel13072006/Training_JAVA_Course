package Classes_object;
import java.util.*;

public class method_3_no_of_positivecount {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int positive_count=0;
        int negative_count=0;
        int zero_count=0;
        char choise='y';

        while(choise == 'y' || choise == 'Y')
        {
            System.out.println("enter number : ");
            int num=sc.nextInt();

            if(num>0)
            {
                positive_count++;
            }
            else if(num<0)
            {
                negative_count=negative_count+1;
            }
            else
            {
                zero_count++;
            }

            System.out.println("Do you wants to continue");
            choise=sc.next().charAt(0);
        }

        System.out.println("positive numbers are = "+positive_count);
        System.out.println("negative numbers are = "+negative_count);
        System.out.println("zero numbers are = "+zero_count);

        sc.close();



    }
}
