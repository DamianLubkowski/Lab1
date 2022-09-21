package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static String leftPad(String aText, char aChar, int aWidth)
    {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer num1 = 0, num2 = 0;

        do {
            System.out.print("Podaj liczbę, którą mam dodać: ");
            num1 = input.nextInt();
            System.out.printf("DEC = %d, BIN = %s, HEX = %s%n", num1, Integer.toBinaryString(num1), Integer.toHexString(num1));
            num2 = input.nextInt();
            System.out.printf("DEC = %d, BIN = %s, HEX = %s%n", num2, Integer.toBinaryString(num2), Integer.toHexString(num2));
            if ((num1 == 0) || (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while (true);
    }
}