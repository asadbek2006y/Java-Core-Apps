import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        // Bizga kerakli o'zgaruvchilarni yaratib olamiz 
        int enter1, enter2, javob;
        // Scanner kutubxonasini chaqirish yordamida sonlarni kiritish uchun foydalanamiz ya'ni input vazifasini bajaradi
        Scanner scanner = new Scanner(System.in);
        // Birinchi sonimizni kiritib olishini so'raymiz 
        System.out.println("Birinchi raqamni kiriting");
        // scanner o'zgaruchisi orqali soni so'rovchi input
        enter1 = scanner.nextInt();
        // Ikkinchi sonimizni so'rab olamiz 
        System.out.println("Ikkinchi raqamni qiymatini kiriting");
        // Ikkinchi sonimizni scanner orqali so'rab oluvchi input
        enter2 = scanner.nextInt();
        // Foydalanuchidan amal kiritishini so'rab qolamiz 
        System.out.println("+ | x | / | - \n Yuqoridagi amallardan birini kiriting");
        String amal = scanner.next();
        // javobni 0 ga tenglab olamiz 
        javob = 0;
        // agar/yoki shartlaridan foydalanim logika yozamiz 
        switch (amal) {
            //agar amal pilusga teng bo'lsa 
            case "+" :
                javob = enter1 + enter2;
                //javob enter bir va enter ikkining qo'shilishiga teng
                break;
                //va amalni to'htamaiz
            case "-":
                javob = enter1 - enter2;
                break;
            case "/":
                javob = enter1 / enter2;
                break;
            case "*":
                javob = enter1 * enter2;
                break;
            /*Agar foydalanuchi boshqa amal kiritsa nima bo'ladi dasturda xatolik kuzatiladi va shunign oldini olish uchun keling bir ishqilamiz */
            default:
                System.out.println("Notogri amal kiritildi");
                break;       
            }
            
        // Javobni chiqarib olamiz
        System.out.println("Sizning javobingiz ==>" + javob);

    }
}
