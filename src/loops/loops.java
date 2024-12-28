package loops;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
      /*  System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<number;i++){
            if(i*i==number){
                System.out.println("perfect number");
            }else{
                System.out.println("not perfect number");
                break;
            }
        }


        int n=4;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println(sum);
        }

        int num=4;
        for (int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);*/

        String str="krish";

        String reverse="";

        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);



        }
    }
