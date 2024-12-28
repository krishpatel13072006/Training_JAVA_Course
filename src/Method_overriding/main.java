package Method_overriding;

public class main {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.area(12, 5);
        rectangle r1=new rectangle();
        r1.area(5,5);
        square s=new square();
        s.area(12);
        circle c=new circle();
        c.area(12.0f);
    }
}
