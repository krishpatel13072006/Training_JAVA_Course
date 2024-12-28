package loops;

public class patterns {
    public static void main(String[] args) {
   /*   for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=4;j++)
          {
              System.out.print(" * ");
          }
          System.out.println();
       }

    */

      /*  for(int i=1;i<=5;i++)
        {
            for(int j=1;j<5;j++)
            {
                if(i==1 || i==5 || j==1 || j==4){
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }


       */

        /*
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

         */

       /* for(int i=1;i<=5;i++)

        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        */

        /*
        for(int i=5;i>=1;i--)

        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


         */


        /*
        for(int i=1;i<=5;i++)
        {
            // spaces
            for (int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

         */

        /*

        for(int i=1;i<=5;i++)
        {
            // spaces
            for (int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }

        for(int i=5-1;i>=1;i--)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

         */

        /*
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //
        //
        //
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //
        //
        //

        for (int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        ////
        ////
        ////
        for (int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //
        //
        //
        int number=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {

                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

         */


       /*
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        */

/*
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(5-i);j++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            for (int j=1;j<=2*(5-i);j++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

 */
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=5-i;j++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
               System.out.print("* ");
           }

           System.out.println();
       }
       for(int i=5;i>=1;i--)
       {
           for(int j=1;j<=5-i;j++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
               System.out.print("* ");
           }

           System.out.println();
       }
        System.out.println("------------------------------------------------------------------------------");


        for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("* ");
           }
           for(int j=1;j<=2*(5-i);j++)
           {
               System.out.print("  ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for (int j=1;j<=2*(5-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------");

        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=10-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=10-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=10;i>=1;i--)
        {
            for(int j=1;j<=10-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=10-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=10-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }



    }
}
