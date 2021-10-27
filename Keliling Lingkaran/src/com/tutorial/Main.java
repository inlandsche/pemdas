package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        /*float r, phi, Kel;

        System.out.println("===== MENGHITUNG KELILING LINGKARAN =====");
        System.out.print("Jari-jari : ");
        r = i.nextFloat();

        if (r%7==0){
            phi = (float) 22 / 7;
            Kel = (2 * phi * r);
            System.out.print("Keliling lingkaran : ");
            System.out.println(Kel);
        }
        else {
            phi = (float) 3.14;
            Kel = (2 * phi * r);
            System.out.print("Keliling lingkaran : ");
            System.out.println(Kel);
        }
        System.out.println();
        System.out.println("TERIMA KASIH"); */

        double r, phi, L, K;

        System.out.println("====== PERHITUNGAN LINGKARAN ======");
        System.out.println();
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Keliling Lingkaran");

        System.out.println();
        System.out.print("Silahkan Pilih : ");
        int a = i.nextInt();

        if (a==1){
            System.out.println();
            System.out.println("Luas Lingkaran");
            System.out.print("Jari-jari : ");
            r = i.nextInt();

            if (r%7==0){
                phi = (double) 22 / 7;
                L = phi * r * r;
                System.out.print("Luas : ");
                System.out.println(L);
            } else {
                phi = 3.14;
                L = phi * r * r;
                System.out.print("Luas : ");
                System.out.println(L);
            }

        } else if (a==2){
            System.out.println();
            System.out.println("Keliling Lingkaran");
            System.out.println("Jari-jari : ");
            r = i.nextInt();

            if (r%7==0){
                phi = (double) 22 / 7;
                K = (2 * phi * r);
                System.out.print("Keliling : ");
                System.out.println(K);
            } else {
                phi = 3.14;
                K = (2 * phi * r);
                System.out.print("Keliling : ");
                System.out.println(K);
            }

        }

        System.out.println();
        System.out.println("TERIMA KASIH <3");
    }
}
