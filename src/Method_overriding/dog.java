package Method_overriding;

public class dog extends Animal {
    public dog(String name){
        super(name);
    }
    @Override
    public void abc(){
        System.out.println("barks!");
    }

    public static void main(String[] args) {
        dog a=new dog("shadow");
        a.abc();
        cat b=new cat("mikky");
        b.abc();
    }
}
