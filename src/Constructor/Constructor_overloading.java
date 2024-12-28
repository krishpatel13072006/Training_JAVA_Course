package Constructor;

public class Constructor_overloading {
    int id;
    String name;
    int age;

  public  Constructor_overloading(int id){
        this.id=id;
    }

    public Constructor_overloading(int id,String name){
      this.id=id;
      this.name=name;

    }
    public Constructor_overloading(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;

    }
    public void display(){
        System.out.println(id+ " " +name+ " " +age);
    }
    public static void main(String[] args) {
        Constructor_overloading a1=new Constructor_overloading(12),a2=new Constructor_overloading(13,"krish"),a3=new Constructor_overloading(14,"kalpesh",45);
        a1.display();
        a2.display();
        a3.display();
        
    }
}
