class BankAccount{
    String accountHolder;
    String accountNumber;
    int balance;

    BankAccount(String accountHolder, String accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void depositMoney(int money){
        this.balance += money;
    }

    void withdrawMoney(int money){
        if(money > this.balance){
            System.out.println("The amount in your account is less than the amount you are trying to withdraw");
            System.out.println("Current balance -> " + this.balance);
            System.out.println("Amount trying to withdraw -> " + money);
            return ;
        }
        this.balance -= money;
    }

    void displayCurrentBalance(){
        System.out.printf("Your current balance for the bank-account %s is %d",this.accountNumber,this.balance);
    }

    void diplay(){
        System.out.println("The account-holder of this account is " + accountHolder);
        System.out.println("The account-number of this account is " + accountNumber);
        System.out.println("Balance of this account is " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        String accountHolder = "Ishaan Gupta";
        String accountNumber = "2110990642";
        int balance = 20000;
        BankAccount bankAccount = new BankAccount(accountHolder,accountNumber,balance);
        bankAccount.diplay();
        bankAccount.displayCurrentBalance();
        bankAccount.depositMoney(1000);
        bankAccount.withdrawMoney(21001);
    }
}