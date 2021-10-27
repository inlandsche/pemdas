package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        int angka, tebakan;
        boolean k = true;

        angka = (int) (Math.random()*20)+1;

        while (k) {
            System.out.print("Tebakanmu : ");
            tebakan = i.nextInt();

            if (tebakan==angka){
                System.out.println("Tebakan antum benar!!");
                k = false;
            } else {
                k = true;
            }

            if (tebakan<angka) {
                System.out.println("Kurang gede");
            }
            else if (tebakan>angka) {
                System.out.println("Kegedean");
            }


        }



    }
}
