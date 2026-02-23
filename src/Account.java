public class Account {
    private String name;
    private String surname;
    private double Balance;


    public Account(String name, String Surname, double Balance){
        this.name = name;
        this.surname = Surname;
        this.Balance = Balance;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
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
