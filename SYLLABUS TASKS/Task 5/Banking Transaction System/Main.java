import java.util.*;

class BankAccount {
    private int balance;

    // Constructor
    public BankAccount() {
        balance = 0;
    }

    // Deposit method
    public void deposit(int amount) {
        balance += amount;
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Get final balance
    public int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        BankAccount account = new BankAccount();

        for (int i = 0; i < N; i++) {
            String operation = sc.next();
            int amount = sc.nextInt();

            if (operation.equals("Deposit")) {
                account.deposit(amount);
            } else if (operation.equals("Withdraw")) {
                account.withdraw(amount);
            }
        }

        System.out.println(account.getBalance());
    }
}