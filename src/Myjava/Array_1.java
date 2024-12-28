package Myjava;

public class Array_1 {
    public void min(){
        int min[]={122,4,542,56,42,56,42,5,4,5,-1,2345};
        int ans=min.length;

        for(int i=0;i<min.length;i++)
        {
            if(min[i]<ans)
            {
                ans=min[i];
                System.out.println("min"+ans);
            }



        }
    }

    public void demo(){
        int num[]=new int[10];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        System.out.println(num[0]+" "+num[1]+" "+num[2]);

        String name[]={"krish","priya","mahima","darshil","hetansh"};
        System.out.println(name[0]);




    }




    public static void main(String[] args) {
        Array_1 x=new Array_1();
        //x.demo();
        x.min();
    }
}
