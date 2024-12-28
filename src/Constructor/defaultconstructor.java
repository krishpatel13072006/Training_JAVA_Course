package Constructor;

public class defaultconstructor {
    int n;
    String name;

    void abc(){
        System.out.println(n+" "+name);
    }
    public static void main(String[] args) {
        defaultconstructor a=new defaultconstructor();
        a.abc();
    }
}
