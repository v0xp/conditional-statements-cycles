import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            System.out.println("Введите год в формате: yyyy количество-дней");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            int days = scanner.nextInt();
            if (days == yearCount(year)){
                count++;
            }else {
                System.out.println("Правильных ответов " + count);
                break;

            }

        }
    }
    public static int yearCount(int year){
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                return 366;
            } else {
                return 365;
            }
        }

}
