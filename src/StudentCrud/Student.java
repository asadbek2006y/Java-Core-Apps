package StudentCrud;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        String name = "";
        int age = 0;

        Scanner scanner = new Scanner(System.in);

        StudentBackend student = new StudentBackend(name, age);
        
        boolean running = true;
        while (running) {
            System.out.println("1 => Talabalar ro'yhati ");
            System.out.println("2 => Talaba qo'shish ");
            System.out.println("3 => Talaba o'chirish");
            System.out.println("4 => Ishni tugatish");
            int amal = scanner.nextInt();
            switch (amal) {
                case 1:
                    System.out.println("Studentlar ro'yxati =>\n" + student.getStudentList().toString());
                    break;
                case 2:
                    System.out.println("Talaba ism va familyasi: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.println("Talaba yoshi: ");
                    age = scanner.nextInt();

                    student.addStudent(name, age);
                    break;
                case 3:
                    System.out.println("O'chirish kerak bo'lgan Student ismini kiriting: ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    student.removeStudent(name, age);
                    break;
                case 4:
                    System.out.println("Xizmatimizdan foydalanganingiz uchun rahmat");
                    running = false;
                    break;
                default:
                    System.out.println("Xatolik");
                    break;
            }
        }

    }
}
