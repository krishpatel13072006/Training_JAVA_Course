package Static;

public class Static_method {

    static int abc(int n1,int n2){
        System.out.println("here's an static method");
        int n3=n1+n2;
        return n3;
    }
    public static void main(String[] args) {

        System.out.println(abc(12,13));

    }
}
