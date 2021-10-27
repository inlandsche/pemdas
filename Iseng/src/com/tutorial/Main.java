package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner anjay = new Scanner(System.in);

        /* System.out.println("---PROGRAM KONVERSI ANGKA KE KARAKTER---");
        System.out.print("Input Angka    : ");
        int a = anjay.nextInt();

        char b = (char) a;
        System.out.printf("\n");
        System.out.print("Hasil Konversi : ");
        System.out.printf("%c", b); */


        /* System.out.println("---PROGRAM KOMPARASI SEDERHANA---");
        double x,y;
        boolean Hasil;

        System.out.print("Nilai x : ");
        x = anjay.nextDouble();
        System.out.print("Nilai y : ");
        y = anjay.nextDouble();
        Hasil = (x<y);

        System.out.print("Hasil Komparasi : ");
        System.out.printf("%f < %f ? %b \n ", x,y,Hasil);
        System.out.print("Semoga Bermanfaat"); */

        System.out.println("DAFTAR OPERATOR");
        System.out.println("1. Penjumlahan ");
        System.out.println("2. Perkalian ");

        System.out.println();
        System.out.print("Silahkan pilih : ");
        int Pilih = anjay.nextInt();


        if (Pilih==1){
            System.out.println();
            System.out.println("PENJUMLAHAN");

            int a,b,c;
            System.out.print("Masukkan angka : ");
            a = anjay.nextInt();
            System.out.print("Ditambah : ");
            b = anjay.nextInt();
            c = a + b;

            System.out.printf("Hasil : %d + %d = %d ", a,b,c);

        } else if (Pilih==2){
            System.out.println();
            System.out.println("PERKALIAN");

            int a,b,c;
            System.out.print("Masukkan angka : ");
            a = anjay.nextInt();
            System.out.print("Dikali : ");
            b = anjay.nextInt();
            c = a * b;

            System.out.printf("Hasil : %d x %d = %d ", a,b,c);


        }

        System.out.println();
        System.out.println();
        System.out.println("Bagaimana? Lanjut? ");
        System.out.println("1. Lanjut ");
        System.out.println("2. Enggak ");
        System.out.println();
        System.out.print("Pilihanmu : ");
        int Lanjut = anjay.nextInt();

        if (Lanjut==1){
            System.out.println("Cape");
        } else if (Lanjut==2){
            System.out.println("Nahh Sip");
        }







    }
}
