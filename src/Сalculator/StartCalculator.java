package Сalculator;

import java.util.Scanner;

public class StartCalculator {
    private int num1;
    private int num2;
    private int sum = 0;
    private char sign;

    void startCalculator() {
        Scanner calculator = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = calculator.nextInt();
        System.out.print("Введите знак арифметической операции: ");
        sign = calculator.next().charAt(0);
        System.out.print("Введите второе число: ");
        num2 = calculator.nextInt();

        switch (sign) {
            case '+':
                sum = num1 + num2;
                break;
            case '-':
                sum = num1 - num2;
                break;
            case '*':
                sum = num1 * num2;
                break;
            case '/':
                sum = num1 / num2;
                break;
            default:
                System.out.println("Введите корректные данные для расчетов");
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + sum);
    }
}
