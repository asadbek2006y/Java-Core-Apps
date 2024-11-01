import java.util.ArrayList;
import java.util.List;

public class AccountBackground{
    private int ID;
    private String name;
    private double balance;
    private List<String> transactionHistory;

    public AccountBackground(int ID, String name, double initialDeposite ){ 
        this.ID = ID;
        this.name = name;
        this.balance = initialDeposite;
        transactionHistory = new ArrayList<>();
        transactionHistory.add("Hisob ochildi. Boshlang'ich depozit: " + initialDeposite);
    }
    public void deposit(double amount){
        if (amount > 0) {
           balance += amount;
           transactionHistory.add("Depozit: " + amount);
           System.out.println(amount + " miqdorda pul kirgizildi");
        }else {
            System.out.println("Xato: Salbiy miqdorda qo'shilmadi");
        }
    }
    public void withdrawal(double amount) {
        if (amount > 0) {
            balance -= amount;
            transactionHistory.add("Pul yechish" + amount );
            System.out.println(amount + " pul miqdorda xisobingizdan yechildi");
        }else{
            System.out.println("Xato: Salbiy miqdorda yechilmadi");
        }
    }
    public double getBalance(){
        return balance;
    }

    public void printTransactionHistory(){
        System.out.println("Hisob tarixi: \n ");
        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
    }
}