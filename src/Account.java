import java.util.ArrayList;

public class Account {

    private static int nextAccountNumber = 18349045;


    private final String name;
    private final String surname;
    private final String AccountNumber;
    private double Balance;
    private final ArrayList<Transactions> transactions;


    public Account(String name, String Surname, double Balance){
        this.name = name;
        this.surname = Surname;
        this.AccountNumber = "ACC" + " " + nextAccountNumber++;
        this.Balance = Balance;
        this.transactions = new ArrayList<>();

    }

    public String getAccountNumber() {
        return AccountNumber;
    }
    public String getFullName(){
        return name + " " + surname;
    }
    public void deposit(double amount){
        if(amount > 0 ){
            Balance += amount;
            Transactions transaction = new Transactions("Deposit ",amount,Balance);
            transactions.add(transaction);

        }else {
            System.out.println("Deposit Amount must be positive");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount<= Balance){
            Balance -= amount;
            Transactions transaction = new Transactions("Withdrawal ",amount,Balance);
            transactions.add(transaction);
        } else if (amount > Balance) {
            System.out.println("you have insufficient balance");
        }else {
            System.out.println("Withdrawal Amount must be positive");
        }

    }
    public void printTransactionHistory(){
        if(transactions.isEmpty()){
            System.out.println("No transaction available");
        } else {
            System.out.println("Transaction History for Account: " + AccountNumber);
            for(Transactions t : transactions){
                System.out.println(t);
            }
        }
    }
    public double getBalance(){
        return Balance;
    }
}
