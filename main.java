import java.util.Scanner;

public class main {

    static String accountHolder;
    static double balance = 0;

    public static void createAccount(String name) {
        accountHolder = name;
        System.out.println("\nAccount created successfully for " + accountHolder);
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        }
    }

    public static void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANK ACCOUNT MANAGEMENT SYSTEM =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        createAccount(name);

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using Bank Account Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

