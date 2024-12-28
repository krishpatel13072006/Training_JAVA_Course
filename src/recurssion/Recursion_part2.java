package recurssion;

//function that calls itself is known as recursion
//once the certain conditions are satisfied then the function stops executing
//In recursion Main function calls the inner function and inner function call itself again and again until the specific
//condition is reached

public class Recursion_part2 {


    //print number form n to 1 using recursion
    public static int print_numbers(int n)
    //for all the parameters in the function a new memory is created
    {
       if(n==0)
       {
           return 0;
       }
        System.out.print(n);
       return print_numbers(n-1); //this is RECURSIVE call
        // main function will fist call the print_number function and print the value of n 5;
        //inner function will call itself and the value of n will be decreased to 1 and prints 4;
        //this recursion continues until n will became 0 and returns  0 and function stops executing;
    }


    public static void main(String[] args) {

        int x=print_numbers(5);
        System.out.println(x);


    }
}
