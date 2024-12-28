package Encapusulation;

public class Get_set_methods {
   private int n;
   private String name;

    public int getn()
    {
        return n;
    }

    public void setn(int n)
    {
        this.n=n;
        //System.out.println(n);
    }

    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name=name;
    }

    public void diplay(){
        System.out.println("roll no.="+n);
        System.out.println("name is="+name);
    }

    public static void main(String[] args) {
        Get_set_methods n=new Get_set_methods();
        n.setn(12);
        n.setname("Manthan");
        System.out.println(n.getn());
        System.out.println(n.getname());

        n.diplay();
    }
}
