package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int pilihan1, jumlah1, pilihan2, jumlah2, harga1 , harga2, totalBelanja1, totalBelanja2, potongan, harusDibayar;
        int totalBelanja;
        String bonus;


        System.out.println("List barang yang dijual");
        System.out.println();
        System.out.println("1. Shampoo (18k) ");
        System.out.println("2. Sikat gigi (5k) ");
        System.out.println("3. Odol (12k) ");
        System.out.println("4. Roti (12,5k) ");
        System.out.println("5. Susu (5k) ");
        System.out.println();



        System.out.print("Barang yang dibeli, jumlah : ");
        pilihan1 = inp.nextInt();
        jumlah1 = inp.nextInt();

        System.out.print("Barang yang dibeli, jumlah : ");
        pilihan2 = inp.nextInt();
        jumlah2 = inp.nextInt();

        if (pilihan1==1){
            harga1 = 18000;
            totalBelanja1 = (jumlah1 * harga1);
        } else if (pilihan1==2){
            harga1 = 5000;
            totalBelanja1 = (jumlah1 * harga1);
        } else if (pilihan1==3){
            harga1 = 12000;
            totalBelanja1 = (jumlah1 * harga1);
        } else if (pilihan1==4){
            harga1 = 12500;
            totalBelanja1 = (jumlah1 * harga1);
        } else if (pilihan1==5){
            harga1 = 5000;
            totalBelanja1 = (jumlah1 * harga1);
        }


        if (pilihan2==1){
            harga2 = 18000;
            totalBelanja1 = (jumlah2 * harga2);
        } else if (pilihan2==2){
            harga2 = 5000;
            totalBelanja1 = (jumlah2 * harga2);
        } else if (pilihan2==3){
            harga2 = 12000;
            totalBelanja1 = (jumlah2 * harga2);
        } else if (pilihan2==4){
            harga2 = 12500;
            totalBelanja1 = (jumlah2 * harga2);
        } else if (pilihan2==5){
            harga2 = 5000;
            totalBelanja1 = (jumlah2 * harga2);
        }



//        if (totalBelanja==50000) {
//            potongan = 3000;
//            System.out.println("Potongan harga : " + potongan);
//            harusDibayar = totalBelanja - potongan;
//            System.out.println("Yang harus dibayar : " + harusDibayar);
//        } else if (totalBelanja==70000){
//            potongan = 5000;
//            System.out.println("Potongan harga : " + potongan);
//            harusDibayar = totalBelanja - potongan;
//            System.out.println("Yang harus dibayar : " + harusDibayar);
//        }

        System.out.println(totalBelanja1);


        if (pilihan1==1 && pilihan2==2) {
            bonus = "odol";
            System.out.println("Bonus : " + bonus);
        } else if (pilihan1==4 && pilihan2==4){
            bonus = "susu";
            System.out.println("Bonus : " + bonus);
        } else {
            System.out.println();
        }




//        harusDibayar = totalBelanja;
//        System.out.println("Yang harus dibayar : " + harusDibayar);


    }
}
