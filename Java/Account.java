import java.util.*;
class Account{
    Scanner sc = new Scanner(System.in);
    float balance = sc.nextFloat();
    void withdraw(float amount)
    {
        if(amount < balance)
        {
            balance = balance - amount;
            System.out.println("Balance after withdraw: "+balance);
        }
        else
        {
            System.out.println("Balance less than the amount to be withdraw");
        }
    }
    void deposit(float amount)
    {
        balance = balance + amount;
        System.out.println("Balance after deposit: "+balance);
    }
    void display()
    {
        System.out.println("Present Balance : "+balance);
    }
    //main
    public static void main(String[] args){
        Account a = new Account();
        a.withdraw(100);
        a.deposit(1000);
        a.display();
    }
}
class Current extends Account{
    void withdraw(float amount)
    {
        balance = balance - amount;
        System.out.println("Balance after withdraw (overdraft): "+balance);
    }
}
