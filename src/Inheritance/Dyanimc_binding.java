package Inheritance;

public class Dyanimc_binding {
 public void display(){
     System.out.println("hello coder***");
 }
    public static void main(String[] args) {
        Dyanimc_binding x=new Dyanimc_binding();
        x.display();
    }
}

//Connecting a method call to the method body is known as binding.
//
//There are two types of binding
//
//Static Binding (also known as Early Binding).
//Dynamic Binding (also known as Late Binding)

//static binding
//When type of the object is determined at compiled time(by the compiler), it is known as static binding.
//
//If there is any private, final or static method in a class, there is static binding.

//Dynamic binding
//When type of the object is determined at run-time, it is known as dynamic binding.