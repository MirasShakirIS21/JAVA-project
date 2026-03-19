// Базовый класс
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Метод для внесения денег
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to account " + accountNumber + ". New balance: " + balance);
    }

    // Метод для снятия денег
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber + ". Current balance: " + balance);
        }
    }

    // Метод main внутри BankAccount
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SAV123", 1000);
        BankAccount credit = new CreditAccount("CRD456", 500);

        savings.deposit(200);
        savings.withdraw(150);

        credit.deposit(100);
        credit.withdraw(700); // проверка превышения баланса
    }
}

// Производный класс SavingsAccount
class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw " + amount + " from savings account " + accountNumber + ". Balance too low.");
        }
    }
}

// Производный класс CreditAccount
class CreditAccount extends BankAccount {
    double creditLimit = 1000; // лимит кредита

    CreditAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance + creditLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from credit account " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Cannot withdraw " + amount + " from credit account " + accountNumber + ". Exceeds credit limit.");
        }
    }
}