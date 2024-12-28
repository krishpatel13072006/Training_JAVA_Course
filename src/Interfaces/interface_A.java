package Interfaces;

public interface interface_A extends Interface_B {

    public void A();

     default void display(){
        System.out.println("default method");

    }
}
