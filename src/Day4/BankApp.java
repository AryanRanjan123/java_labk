package Day4;

// Superclass
class Account {
    protected static int accCounter = 1000;
    protected int accountNumber;
    protected String name;
    protected String accountType;
    protected double balance;
    protected int day, month, year;

    Account(String name, String accountType, double balance) {
        this.accountNumber = ++accCounter;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: ₹" + balance);
    }

    void deposit(double amount, int day, int month, int year) {
        balance += amount;
        this.day = day;
        this.month = month;
        this.year = year;
        System.out.println("₹" + amount + " deposited on "
                + day + "/" + month + "/" + year);
    }

    void withdraw(double amount) {
        System.out.println("Withdraw method of Account");
    }
}

// Subclass: Standard Account
class StandardAccount extends Account {

    StandardAccount(String name, double balance) {
        super(name, "Standard", balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else if (amount <= 100000) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn without penalty.");
        }
        else if (amount <= 500000) {
            double penalty = amount * 0.0005;
            balance -= (amount + penalty);
            System.out.println("₹" + amount + " withdrawn with penalty ₹" + penalty);
        }
        else {
            System.out.println("Withdrawal limit exceeded for Standard Account.");
        }
    }
}

// Subclass: Premium Account
class PremiumAccount extends Account {

    PremiumAccount(String name, double balance) {
        super(name, "Premium", balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else if (amount <= 1000000) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
        else {
            System.out.println("Withdrawal limit exceeded for Premium Account.");
        }
    }
}

// Main Class (ONLY ONE public class)
public class BankApp {
    public static void main(String[] args) {

        // Dynamic Method Dispatch
        Account acc;

        acc = new StandardAccount("Amit", 600000);
        acc.deposit(50000, 6, 1, 2026);
        acc.withdraw(200000);
        acc.checkBalance();

        System.out.println("------------------------");

        acc = new PremiumAccount("Rohit", 2000000);
        acc.deposit(100000, 6, 1, 2026);
        acc.withdraw(800000);
        acc.checkBalance();
    }
}
