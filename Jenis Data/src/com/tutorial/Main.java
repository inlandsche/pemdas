package com.tutorial;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Konversi Suhu");
        System.out.println("Silahkan Masukkan Suhu (F)");

        double F;
        double C;


        F = input.nextDouble();
        C = (double) 5 / 9 * ( F - 32 );

        System.out.println("Hasil Konversi (C)");
        System.out.println(C);

    }
}
