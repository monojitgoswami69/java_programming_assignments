package assignment4;

class Account {
    String name;
    String accountNumber;
    String type;
    double balance;

    Account(String name, String accountNumber, String type, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println(name + " " + balance);
    }
}

class Curr_Acct extends Account {
    static final double MIN_BALANCE = 1000;
    static final double SERVICE_CHARGE = 100;

    Curr_Acct(String name, String accountNumber, double balance) {
        super(name, accountNumber, "Current", balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            if (balance < MIN_BALANCE) {
                balance -= SERVICE_CHARGE;
            }
        }
    }
}

class Savn_Acct extends Account {
    double rate;

    Savn_Acct(String name, String accountNumber, double balance, double rate) {
        super(name, accountNumber, "Savings", balance);
        this.rate = rate;
    }

    void computeAndDepositInterest() {
        balance += balance * rate / 100.0;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
}

public class A4P4 {
    public static void main(String[] args) {
        Curr_Acct current = new Curr_Acct("Ram", "C101", 1500);
        current.deposit(500);
        current.withdraw(1200);
        current.displayBalance();

        Savn_Acct savings = new Savn_Acct("Shyam", "S201", 2000, 5);
        savings.deposit(300);
        savings.computeAndDepositInterest();
        savings.withdraw(400);
        savings.displayBalance();
    }
}
