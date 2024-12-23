import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial balance
        double balance = 1000.0; // Default balance
        boolean exit = false;

        System.out.println("Welcome to the ATM Simulation System!");

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Successfully deposited " + deposit + ". Your new balance is: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Successfully withdrew " + withdraw + ". Your new balance is: " + balance);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        System.out.println("Invalid withdrawal amount!");
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM Simulation System. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
