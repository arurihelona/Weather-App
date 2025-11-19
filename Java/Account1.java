import java.util.*;
class Account1{
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
    public static void main(String[] args){
        Account1 a = new Account1();
        a.withdraw(100);
        a.deposit(1000);
        a.display();
    }
}