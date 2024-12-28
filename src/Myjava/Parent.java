package Myjava;

import Datatype.Datatype;

public class Parent extends Datatype {
    @Override
   public void abc(){
        String k="Method override";
        System.out.println(k);
    }
    int num(int l){
        return l*2;
    }
    public static void main(String[] args) {
        Datatype y=new Datatype();
        y.abc();
        Parent x=new Parent();
        x.abc();
        System.out.println(x.num(12));


    }
}
