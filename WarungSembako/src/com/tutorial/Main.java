package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bonus;
        int harga1, harga2, total1, total2, totalBelanja;


        int p1 = input.nextInt();
        int jumlah1 = input.nextInt();

        int p2 = input.nextInt();
        int jumlah2 = input.nextInt();

        if (p1==1 && p2==2){
            bonus = "odol";
        } else if (p1==4 && p2==4){
            bonus = "Susu";
        } else {
            bonus = "-";
        }

        if (p1==1){
            harga1 = 18000;
            total1 = (jumlah1 * harga1);
        } else if (p1==2){
            harga1 = 5000;
            total1 = (jumlah1 * harga1);
        } else if (p1==3){
            harga1 = 12000;
            total1 = (jumlah1 * harga1);
        } else if (p1==4){
            harga1 = 12500;
            total1 = (jumlah1 * harga1);
        } else if (p1==5){
            harga1 = 5000;
            total1 = (jumlah1 * harga1);
        } else if (p2==1){
            harga2 = 18000;
            total2 = (jumlah2 * harga2);
        } else if (p2==2){
            harga2 = 5000;
            total2 = (jumlah2 * harga2);
        } else if (p2==3){
            harga2 = 12000;
            total2 = (jumlah2 * harga2);
        } else if (p2==4){
            harga2 = 12500;
            total2 = (jumlah2 * harga2);
        } else if (p2==5){
            harga2 = 5000;
            total2 = (jumlah2 * harga2);
        }





    }
}
