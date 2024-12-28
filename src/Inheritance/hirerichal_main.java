package Inheritance;

public class hirerichal_main extends Multilevel_Animal_inheritance {

    public void mainn(){
        System.out.println("hirearichal example");
    }
    public static void main(String[] args) {
       hirerichal_main x=new hirerichal_main();
        x.mainn();
       x.speak();
       Multilevel_cat n=new Multilevel_cat();
       n.mewo();
        n.speak();
    }
}
