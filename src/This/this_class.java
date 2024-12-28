package This;

public class this_class {

    public this_class()
    {
       // this(10);
        System.out.println("hello world");
    }

   public this_class(int x){
       this();  //constructor can be called in another constructor using this() if the parameter is passed then this(para)
        System.out.println("valur of x is:"+x);
       this.hello();// method can be called using this keyword in another method or constructor
    }

    public void hello(){
        System.out.println("hey what's your name");
    }


    public static void main(String[] args) {

        this_class a=new this_class(10);


    }
}
