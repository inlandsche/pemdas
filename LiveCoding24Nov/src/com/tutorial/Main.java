package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        /* nomor 1
        String nama, kadaluarsa = "";
        int banyak, toleransi, kopikapBasi = 0;

        nama = in.nextLine();
        banyak = in.nextInt();
        toleransi = in.nextInt();

        for(int i = 0; i<banyak; i++){
            kadaluarsa = in.nextLine();
            String tanggal = kadaluarsa.substring(0,2);
            String bulan = kadaluarsa.substring(3,5);

            int tgl = Integer.parseInt(tanggal);
            int bln = Integer.parseInt(bulan);

            if (bln==11){
                if (tgl<24) ++kopikapBasi;
            }
            else if (bln<11) ++kopikapBasi;


        }

        if (kopikapBasi>toleransi) System.out.printf("Perut %s sakit", nama);
        else if (kopikapBasi<=toleransi) System.out.printf("Perut %s baik-baik saja", nama);
        */

        int n, angka, p;

        n = in.nextInt();

        int big = 0;
        int small = 999999;

        /* atau
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

         */

        for (p = 0; p < n; p++){
            angka = in.nextInt();

            if (angka<small) small = angka;
            else if (angka>big) big = angka;
        }

        System.out.println(big);
        System.out.println(small);
    }
    }

