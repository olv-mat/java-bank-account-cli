import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Account");

        String accountOwner = "Matheus Oliveira";
        String accountType = "Checking Account";
        double accountBalance = 2000;

        System.out.println("=".repeat(30));
        System.out.println("Account Owner: " + accountOwner);
        System.out.println("Account Type: " + accountType);
        System.out.printf("Balance: USD %.2f%n", accountBalance);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(30));
            System.out.println("Menu");
            System.out.println("1 - Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");
            System.out.println("=".repeat(30));
            System.out.print("Option: ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Balance: USD %.2f%n", accountBalance);
                    break;
                case 2:
                    System.out.print("Deposit Amount: USD ");
                    double depositAmount = input.nextDouble();
                    accountBalance += depositAmount;
                    System.out.printf("Updated Balance: USD %.2f%n", accountBalance);
                    break;
                case 3:
                    System.out.print("Withdraw Amount: USD ");
                    double withdrawAmount = input.nextDouble();
                    if (withdrawAmount > accountBalance) {
                        System.out.println("Insufficient Balance");
                        break;
                    }
                    accountBalance -= withdrawAmount;
                    System.out.printf("Updated Balance: USD %.2f%n", accountBalance);
                    break;
                case 4:
                    System.out.println("Leaving...");
                    return;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}