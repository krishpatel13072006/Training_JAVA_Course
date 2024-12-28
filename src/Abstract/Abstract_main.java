package Abstract;

public class  Abstract_main extends Abstract_method {
  public void display(){
      System.out.println("I am an abstract method");
  }
    public static void main(String[] args) {
        Abstract_method x=new Abstract_main();
        x.abc();
        x.display();
    }
}



//An abstract class must be declared with an abstract keyword.
//It can have abstract and non-abstract methods.
//It cannot be instantiated.
//It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.

//When to Use Abstract Classes?
//Abstract classes are beneficial in various scenarios, including:
//
//Code Reusability: Abstract classes facilitate code reuse by allowing common methods to be implemented once and inherited by multiple subclasses.
//
//Defining a Common Interface: Abstract classes can define a common interface for a group of related classes, ensuring consistency in their structure and behavior.
//
//Enforcing Method Implementation: Abstract classes can enforce the implementation of certain methods by declaring them as abstract, thereby ensuring that subclasses provide necessary functionality.