package Method_overriding;

public class baby_dog extends Animal {
    public baby_dog(String name) {
        super(name);
    }

    @Override
    public void abc() {
        System.out.println("runtime polymorphism");
        System.out.println("inherited class of Animal");
    }

    public static void main(String[] args) {
        baby_dog x=new baby_dog("tommy");
        ///---------------------------------------------
        Animal v=new baby_dog("husky");
        v.abc();

    }
}

//If the reference variable of Myjava.Parent class refers to the object of Child class, it is known as upcasting. For example:
//class Bike{
//  void run(){System.out.println("running");}
//}
//class Splendor extends Bike{
//  void run(){System.out.println("running safely with 60km");}
//
//  public static void main(String args[]){
//    Bike b = new Splendor();//upcasting
//    b.run();
//  }
//}
