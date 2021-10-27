package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Anton habis belanja dan ingin pulang dari supermarket. Karena keadaan pada saat itu sudah Malam, maka Anton curiga jika ada seseorang yang mengejar Anton. Anton lalu menyalakan motornya dan ngegas sekuat tenaga. Saat Anton sudah berjalan menuju rumahnya, ternyata memang ada seseorang yang sedang mengejar Anton tetapi untungnya Anton memiliki jarak dengan pengejarnya tersebut. Apakah Anton berhasil selamat, ataukah Anton tertangkap?
//
//        Hint: Gunakan Math.abs() untuk mencegah nilai minus.
//
//        Input Format
//
//        Baris pertama merupakan perbedaan jarak Anton dengan jarak pengejar. (m)
//        Baris kedua merupakan kecepatan Anton. (m/s)
//        Baris ketiga merupakan kecepatan Pengejar. (m/s)
//        Baris keempat merupakan jarak yang dibutuhkan Anton untuk sampai ke rumah. (m)
//
//        Constraints
//
//        100 < x < 1000
//        10 < x < 50
//        10 < x < 50
//        100 < x < 1000


        Scanner in = new Scanner(System.in);

        int perbedaan, kecA, kecP, jarakA;
        int wA, wP;

        perbedaan = in.nextInt();
        kecA = in.nextInt();
        kecP = in.nextInt();
        jarakA = in.nextInt();

        wA = jarakA/kecA;
        wP = (perbedaan + jarakA)/kecP;

        if (wA < wP){
            System.out.println("Anton Selamat");
        } else {
            System.out.println("Anton Tertangkap");
        }

    }
}
