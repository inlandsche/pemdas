package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int tambah = 0;
        int tambah2 = 0;
        int a = 0;
        int b = 0;


        for (int i = 0; i < input.length(); i++){
            String angka = input.substring(i, i+1);

            a = Integer.parseInt(angka);

            tambah = tambah + a;
        }

        String angka2 = String.valueOf(tambah);

        for (int i = 0; i < angka2.length(); i++){
            String angka3 = angka2.substring(i, i+1);

            b = Integer.parseInt(angka3);

            tambah2 = tambah2 + b;

        }

        System.out.println(tambah2);

    }
}
