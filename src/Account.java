public class Account {

    private static int nextAccountNumber = 18349045;


    private String name;
    private String surname;
    private String AccountNumber;
    private double Balance;



    public Account(String name, String Surname, double Balance){
        this.name = name;
        this.surname = Surname;
        this.AccountNumber = "ACC NO: " + " " + nextAccountNumber++;
        this.Balance = Balance;

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
            System.out.println("+" + amount + " into your Savings Account");
        }else {
            System.out.println("Deposit Amount must be positive");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount<= Balance){
            Balance -= amount;
        } else if (amount > Balance) {
            System.out.println("you have insufficient balance");
        }else {
            System.out.println("Withdrawal Amount must be positive");
        }

    }
    public double getBalance(){
        return Balance;
    }
}
