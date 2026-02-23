import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Bank bank = new Bank();

        int choice;
        double Balance = 0.0;

        do {
            System.out.println("\n==============BANK SYSTEM==============");

            System.out.println("1.  Create Account");
            System.out.println("2.  Deposit");
            System.out.println("3.  withdraw");
            System.out.println("4.  view your Balance");
            System.out.println("5.  Exit");
            System.out.println("Choose option: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter your name: ");
                    String firstName = input.nextLine();

                    System.out.println("Enter your Surname: ");
                    String lastName = input.nextLine();

                    Account clientAccount = new Account(firstName, lastName, Balance);
                    bank.addAccount(clientAccount);

                    System.out.println("Your Account Number is: " + clientAccount.getAccountNumber());
                    break;
                case 2:
                    System.out.println("Enter your Account number: ");
                    String depositAcc = input.nextLine();

                    Account depositAccount = bank.findAccount(depositAcc);

                    if (depositAccount != null) {
                        System.out.println("Enter amount: ");
                        double amount = input.nextDouble();
                        depositAccount.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter Account Number: ");
                    String withdrawAcc = input.nextLine();

                    Account withdrawAccount = bank.findAccount(withdrawAcc);

                    if (withdrawAccount != null) {
                        System.out.println("Enter Amount: ");
                        double amount = input.nextDouble();
                        withdrawAccount.withdraw(amount);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter Account number: ");
                    String viewAcc = input.nextLine();

                    Account viewAccount = bank.findAccount(viewAcc);

                    if (viewAccount != null) {
                        System.out.println("Account holder: " + viewAccount.getFullName());
                        System.out.println("Balance: " + viewAccount.getBalance());
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid option.");


            }

        }while(choice != 5);

        input.close();
    }
}