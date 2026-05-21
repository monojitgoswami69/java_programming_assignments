package assignment2;

class BankAccount {
    String name;
    String accountNumber;
    String accountType;
    double balance;

    BankAccount(String name, String accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    void display() {
        System.out.println(name + " " + balance);
    }
}

public class A2P5 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ram", "12345", "Savings", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.display();
    }
}
