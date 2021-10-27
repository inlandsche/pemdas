package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pembalik angka

        /*
        int angka = in.nextInt();

        String a = String.valueOf(angka);
        int pj = a.length();


        for(int i = 1; i <= pj ; i++){
            System.out.print(a.charAt((pj) - i));
        }
        */

        // Pembalik huruf

        String huruf = in.nextLine();

        int panjang = huruf.length();

        for (int i = 1; i <= panjang; i++)
            System.out.print(huruf.charAt((panjang)-i));


    }
}
