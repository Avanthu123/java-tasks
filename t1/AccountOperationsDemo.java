// Define account operations
interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

// Represents a bank account
class BankAccount implements AccountOperations {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Savings account (inherits from BankAccount and adds interest)
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayBalance() {
        double newBalance = getBalance() + (getBalance() * interestRate / 100);
        System.out.println("Balance with interest: " + newBalance);
    }
}

public class AccountOperationsDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 5000);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayBalance();

        System.out.println("----------------------");

        BankAccount acc2 = new SavingsAccount("Bob", 10000, 5);
        acc2.displayBalance();
    }
}