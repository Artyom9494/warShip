package Scan;

import java.util.Scanner;

public class ScanValue {
    public static void main(String[] args) {
        Scanner value1 = new Scanner(System.in);
        Scanner value2 = new Scanner(System.in);
        Scanner charValue = new Scanner(System.in);

        System.out.print("Введи число 1 : ");
        int myNumber1 = value1.nextInt();
        System.out.println(myNumber1);

        System.out.println("Введи математеческое действие (- || + || / || *)");
        String myChar = charValue.nextLine();

        System.out.print("Введи число 2 : ");
        int myNumber2 = value2.nextInt();
        System.out.println(myNumber2);


        System.out.println(myNumber1 +  + myNumber2);

    }
}