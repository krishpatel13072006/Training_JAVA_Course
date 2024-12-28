package Conditional_statements;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args)
    {
        System.out.println("-----------------if Statement-----------------");
        int a=23;
        if(a==23){
            System.out.println("true");
        }
        System.out.println();



        System.out.println("-----------------if-else Statement-----------------");
        int age=18;
        if(age<=18){
        System.out.println("eligible");
        }
        else{
            System.out.println("Not eligible");
        }
        System.out.println();

        System.out.println("-----------------if-else ladder Statement-----------------");
        String x="hello";
        if(x=="helloo"){
            System.out.println("hello there");
        }else if(age<=18){
            System.out.println("eligible");
        }else {
            System.out.println("Not eligible");
        }
        System.out.println();

        System.out.println("-----------------nestef if else Statement-----------------");
        System.out.println("enter number a:");
        Scanner sc=new Scanner(System.in);
        int f1 =sc.nextInt();
        System.out.println("enter number b:");
        Scanner sc1=new Scanner(System.in);
        int f2=sc1.nextInt();
        System.out.println("enter number c:");
        Scanner sc2=new Scanner(System.in);
        int f3=sc.nextInt();

        if(f1>f2){
            System.out.println("a=greater than b");
            if(f1>f3){
                System.out.println("a is greater than c");
                System.out.println("a is the largest number");
            }else{
                System.out.println("f3 is greater number");
            }
        }else{
            System.out.println("b is greater then a");
            if(f2>f3){
                System.out.println("b is greater than c");
            }else{
                System.out.println("c is greater than all");
            }
        }
        System.out.println();


        System.out.println("-----------------Switch Case Statement-----------------");
        int day=2;
        switch(day){
            case 1:
                System.out.println("monday");
                    break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("sunday");

        }







    }
}
