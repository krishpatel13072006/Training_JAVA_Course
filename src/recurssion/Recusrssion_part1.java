package recurssion;

//function that calls itself is known as recursion
//once the certain conditions are satisfied then the function stops executing

public class Recusrssion_part1 {


    // mwthod without recursion
    public static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++)
        {
            if(n<=0)
            {
                return 1;
            }
            result=result*i;
        }
        return result;
    }

    //factor with recursion
    public static int factor(int n){
        //5! = 5 4! (n*(n-1)
        //4! = 4 3!  ..
        //.
        //.
        //1
        if(n==1 || n==0)
        {
            return 1;
        }
        return n*factor(n-1);

    }

    public static void main(String[] args) {


       int x=factorial(5);
        System.out.println(x);

        int x1=factor(5);
        System.out.println(x1);
    }
}
