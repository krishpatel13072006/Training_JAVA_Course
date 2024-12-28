package Final;

//1) Java final variable
//If you make any variable as final, you cannot change the value of final variable(It will be constant).
//2) Java final method
//If you make any method as final, you cannot override it.
//3) Java final class
//If you make any class as final, you cannot extend it.
//4)static blank final variable
//A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.



public final class final_examples {
    final int  maxspeed=120;
   final int minspeed;
   static final int x;

   final_examples(){
       minspeed=20;
   }

   static{

       x=10;
       System.out.println(x);
   }
    final void display(){
        System.out.println("this method cannot be overridden but inherited");
    }

    public static void main(String[] args) {
        final_examples n=new final_examples();
        n.display();
    }

}
