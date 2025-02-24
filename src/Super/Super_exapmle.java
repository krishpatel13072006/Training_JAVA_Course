package Super;

import This.Employee;

//super can be used to refer immediate parent class instance variable.
//super can be used to invoke immediate parent class method.
//super() can be used to invoke immediate parent class constructor.
public class Super_exapmle extends Employee {
    Super_exapmle(String name,int number)
    {
        super(name,number);
        super.display();

    }

    public static void main(String[] args) {
        Super_exapmle x=new Super_exapmle("krish", 1);

    }

}
