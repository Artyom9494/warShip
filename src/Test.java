public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Круг " + i);
            if (i % 2 == 0) {
                for (int r = 1; r <= 3; r++) {
                    System.out.println("  Отжимаемся " + r);
                }
            } else if (i % 2 != 0) {
                for (int s = 1; s <= 5; s++)
                    System.out.println("  Приседаем " + s);
            }
            for (int d = 1; d <= 7; d++) {
                System.out.println("  Качаем пресс " + d);
            }
        }
    }
}
