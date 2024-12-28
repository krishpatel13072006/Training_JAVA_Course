package Method_overloading;

public class Method_overloading {

    public void sum(){
        System.out.println("summation of numbers");
    }
    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public void sum(float a,float b){
        System.out.println(a+b);
    }

    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }


    public static void main(String[] args) {
        Method_overloading x=new Method_overloading();
        x.sum();
        x.sum(1,1);
        x.sum(1.1f,1.1f);
        x.sum(1,1,1);


    }
}
