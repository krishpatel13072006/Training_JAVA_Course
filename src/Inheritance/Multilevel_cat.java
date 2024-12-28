package Inheritance;


public class Multilevel_cat extends Multilevel_dog {
    public void mewo(){
        System.out.println("cats Meow's");
    }

    public static void main(String[] args) {
        Multilevel_cat x=new Multilevel_cat();
        x.speak();
        x.bark();
        x.mewo();
    }
}
