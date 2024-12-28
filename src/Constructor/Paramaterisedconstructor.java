package Constructor;

public class Paramaterisedconstructor {
    int x;
    String name;

    public Paramaterisedconstructor(int n,String nam){
        x=n;
        name=nam;
    }

    public void display(){
        System.out.println(x+" "+name);
    }

    public static void main(String[] args) {
        Paramaterisedconstructor p=new Paramaterisedconstructor(1,"krish");
        p.display();
    }
}
