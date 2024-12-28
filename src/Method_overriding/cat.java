package Method_overriding;

public class cat extends Animal {
    public cat(String name){
        super(name);
        System.out.println(name);
    }

    @Override
    public void abc(){
        System.out.println("Meow!");
    }
}
