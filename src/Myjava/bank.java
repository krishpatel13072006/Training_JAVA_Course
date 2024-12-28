package Myjava;

public class bank {
    int id;
    String name;
    float amount;

    bank(int id,String name,float amount){
        this.id=id;
        this.name=name;
        this.amount=amount;
        System.out.println(id+" "+name+" "+amount);
    }

    public void deposit(float amt){
        amount=amount+amt;
    }

    public void withdraw( float amt){
        if(amount<amt){
            System.out.println("balance insufficient");
        }else{
            amount=amount-amt;
        }
    }

   public void balance(){
        System.out.println(amount);
    }


    public static void main(String[] args) {

      bank n=new bank(101,"krish",5000);
        n.deposit(2000);
        n.withdraw(100);
        n.balance();
    }
}
