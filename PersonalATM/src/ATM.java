public class ATM {
    public double balance;

    public ATM(double initialBalance){
        this.balance = initialBalance;
        System.out.println("Initial Balance: " + initialBalance);
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + this.balance);
    }
    public void withdraw(double amount){
        this.balance -= amount;
        System.out.println("Withdraw: " + amount + ", New Balance: " + this.balance);
    }
    public double checkBalance(){
        return balance;
    }
}
