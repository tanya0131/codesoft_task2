import java.util.*;

class UserAccount{
    public float balance=3000;

}

class Atm{
    //private float balance;
    private int pin=8765;
    UserAccount obj = new UserAccount();

    public void pincheck(){
        System.out.println("Enter your pin: ");
        Scanner sc= new Scanner(System.in);
        int epin = sc.nextInt();
        if(epin==pin)
        {
            menu();
        }
        else
        {
            System.out.println("Enter the valid pin!!");
            pincheck();
        }
    }

    public void menu(){
        System.out.println("***********WELCOME************");
        System.out.println("Enter your choice: ");
        System.out.println("1. Check your Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        Scanner o = new Scanner(System.in);
        int ch = o.nextInt();

        if(ch==1)
        {
            checkBalance();
        }
        else if(ch==2)
        {
            depositMoney();
        }
        else if(ch==3)
        {
            withdrawMoney();
        }
        else if(ch==4)
        {
            return;
        }
        else
        {
            System.out.println("Enter the valid choice");
            menu();
        }

    }

    public void checkBalance(){
        
        System.out.println("Your account balance is "+obj.balance);
        menu();

    }
    public void depositMoney(){
        System.out.println("Enter the Amount you want to deposit: ");
        Scanner s =new Scanner(System.in);
        float amount = s.nextFloat();
        obj.balance=obj.balance+amount;
        System.out.println("Amount deposited Succesfully");
        menu();
        
    }

    public void withdrawMoney(){
        System.out.println("Enter the Amount you want to withdraw: ");
        Scanner s =new Scanner(System.in);
        float amount = s.nextFloat();
        if(amount>obj.balance)
        {
            System.out.println("Insufficient Account balance");
        }
        else{
        obj.balance=obj.balance-amount;
        System.out.println("Amount withdrawn Succesfully");
        }
        menu();
    }

}

public class task2 {
    public static void main(String[] args) {
        Atm object = new Atm();
        object.pincheck();
    }
}
