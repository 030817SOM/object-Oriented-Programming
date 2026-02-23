import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your Surname: ");
        String lastName = input.nextLine();

        double Balance = 0.0;

        Account clientAccount = new Account(firstName, lastName, Balance);
        System.out.println("Current Balance R" + clientAccount.getBalance());

        System.out.println("Enter Deposit Amount: ");
        double depositAmount = input.nextDouble();
        clientAccount.deposit(depositAmount);

        System.out.println("Enter Withdrawal Amount: ");
        double withdrawalAmount = input.nextDouble();
        clientAccount.withdraw(withdrawalAmount);

        System.out.println("your Available Balance now is R " + clientAccount.getBalance());


    }
}