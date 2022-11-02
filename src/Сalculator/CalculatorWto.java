package Сalculator;

import java.util.Scanner;

public class CalculatorWto {
    private int num1;
    private int num2;
    private char sing;
    private int sum;


    public void carCalculator () {
        Scanner valueScan = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num1 = valueScan.nextInt();
        System.out.print("enter arithmetic sign: ");
        char sing = valueScan.next().charAt(0);
        System.out.print("enter the number: ");
        int num2 = valueScan.nextInt();


        switch (sing) {
            case '/':
                sum = num1 / num2;
                break;
            case '*':
                sum = num1 * num2;
                break;
            case '-':
                sum = num1 - num2;
                break;
            case '+':
                sum = num1 + num2;
                break;
            default:
                System.out.println("ВВедите корректные данные");
        }
        System.out.println(num1 + " " + sing + " " + num2 + " = " + sum);
    }
}
