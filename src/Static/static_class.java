package Static;

public class static_class
{

    int id;
    static_class(int id){
        this.id=id;
    }
    static String name="krish";
   public static void abc(){
        name="kalpesh";
       // System.out.println(name);
    }

    public void display(){
        System.out.println(id+" "+name);
    }


    static{
        System.out.println(1+2);
    }



    public static void main(String[] args)
    {
       static_class.name="priya";
       static_class.abc();
        static_class x=new static_class(10);
        x.display();

    }
}
