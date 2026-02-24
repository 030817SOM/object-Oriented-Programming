import java.time.LocalDateTime;

public class Transactions {
    private LocalDateTime date;
    private final String type;
    private final double amount;
    private final double balanceAfter;

    public Transactions(String type, double amount, double balanceAfter){
        this.balanceAfter = balanceAfter;
        this.amount = amount;
        this.type = type;
    }
    public String toString(){
        return "Date: " + date +
                "| Type: " + type +
                "| Amount: R" + amount +
                "| Balance After: R" + balanceAfter;
    }

}
