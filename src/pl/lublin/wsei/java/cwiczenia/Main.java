package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Account.translit("Дамиан Łубкощски"));
        System.out.println(Account.translit("Пиотр Гоłąбек"));
        System.out.println(Account.translit("Томек Щлизло"));
        System.out.println(Account.translit("Марцин Элеń"));
        System.out.println(Account.translit("Мариусз Пыза"));

    }
}