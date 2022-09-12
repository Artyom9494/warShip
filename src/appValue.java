import java.util.Scanner;

public class appValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Угадай число");
        int value = s.nextInt();

        while (value != 5) {
            System.out.println("Попробуй ещё");
            value = s.nextInt();
        }
        System.out.println(" Поздравляю вы угадали");
    }
}
