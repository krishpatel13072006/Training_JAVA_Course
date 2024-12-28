package Interfaces;

public class Interface_main implements interface_A {

    public void A(){
        System.out.println("method of A interface");
    }

    @Override
    public void B() {
        System.out.println("method of B interface");
    }

    public static void main(String[] args) {
        interface_A x=new Interface_main();
        Interface_B n=new Interface_main();
        x.A();
        x.B();
        x.display();
        Interface_B.abc();
    }
}

//The interface in Java is a mechanism to achieve abstraction.
// There can be only abstract methods in the Java interface, not method body.
// It is used to achieve abstraction and multiple inheritance in Java.
//Java Interface also represents the IS-A relationship.
//It cannot be instantiated just like the abstract class.
//Since Java 8, we can have default and static methods in an interface.
//Since Java 9, we can have private methods in an interface.