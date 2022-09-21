package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("Piotr Gołabek");
        System.out.println(acc.getName());
    }
}