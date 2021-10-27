package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Pengulangan dengan while
        Scanner input = new Scanner(System.in);
        int a,b,hasil;  boolean proses = true;

        while (proses) {
            System.out.println("Program Matematika");
            System.out.println();
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println();
            System.out.print("Pilihan : ");
            int inputPil = input.nextInt();
            System.out.print("\n");

            switch (inputPil){
                case 1 :
                    System.out.print("====== Penjumlahan ====== \n\n");
                    System.out.print("Masukkan nilai : ");
                    a = input.nextInt();
                    System.out.println("------------------- (+)");
                    System.out.print("Masukkan nilai : ");
                    b = input.nextInt();
                    hasil = a + b;
                    System.out.println("Hasil = " + hasil);
                    break;
                case 2 :
                    System.out.print("====== Pengurangan ====== \n\n");
                    System.out.print("Masukkan nilai : ");
                    a = input.nextInt();
                    System.out.println("------------------- (-)");
                    System.out.print("Masukkan nilai : ");
                    b = input.nextInt();
                    hasil = a - b;
                    System.out.println("Hasil = " + hasil);
                    break;
                default :
                    System.out.println("Tidak ditemukan");
            }

            System.out.println();
            System.out.println();
            System.out.println("Apakah ingin lanjut?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Pilihan : ");
            int inputPil2 = input.nextInt();
            System.out.println();

            switch (inputPil2){
                case 1 :
                    proses = true;
                    break;
                case 2 :
                    System.out.println("Yo Wess");
                    proses = false;
                    break;
                default :
                    System.out.println("Tidak ditemukan");


            }

        }



    }
}

