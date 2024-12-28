package This;

public class Employee {
    String name;
    int number;
    static String company="TATA Agency";
    public Employee(String name,int number){

        this.name=name;
        this.number=number;
        //this.company=company;

    }
    public void display(){
        System.out.println("Employee name is:"+name);
        System.out.println("Employee number is:"+number);
        System.out.println("Company name is:"+company);
    }


    public static void main(String args[]){
        Employee e1=new Employee("Krish patel",23);
        System.out.println(e1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        Employee e2=new Employee("Kalpesh patel",24);
        System.out.println(e2);
    }
}
