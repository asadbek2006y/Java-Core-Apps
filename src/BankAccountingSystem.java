import java.util.Scanner;

public class BankAccountingSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hisob ochish jarayoni
        System.out.println("ID kiriting");
        int ID = scanner.nextInt();

        System.out.println("Ism kiriting");
        String name = scanner.next();

        System.out.println("Boshlang'ich depozit kiriting");
        double initialDeposite = scanner.nextDouble();

        AccountBackground bankAccount = new AccountBackground(ID, name, initialDeposite);

        // foydalanuvchi amallari
        boolean running = true;
        while (running) {
            System.out.println("Buyruqlardan birortasini tanlang\n");
            System.out.println("1. Balansni tekshirish");
            System.out.println("2. Pul qo'shish");
            System.out.println("3. Pul yechish");
            System.out.println("4. O'tkazmalar tarixini ko'rish");
            System.out.println("5. Ishni yakunlash");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Joriy balans :  " + bankAccount.getBalance());
                    break;
                case 2:
                    System.out.println("Pul qo'shish : ");
                    double depositAmmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmmount);
                    break;
                case 3:
                    System.out.println("Pul yechib olish: ");
                    double withdrawalMoney = scanner.nextDouble();
                    bankAccount.withdrawal(withdrawalMoney);
                    break;
                case 4:
                    System.out.println("O'tkazmalar tarixi: \n " );
                    bankAccount.printTransactionHistory();  
                    break;
                case 5:
                    running = false;
                    System.out.println("Dasturni to'xtatyapmiz...");
                    break;
                    
                default:
                System.out.println("Noto'g'ri tanlov. Qaytadan urinib ko'ring.");
                    break;
            }
        }
        scanner.close();
    }
}
