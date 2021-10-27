package com.tutorial;

public class Main {

    public static void main(String[] args) {

        int angka = (int) (Math.random()*99)+1;
        System.out.println("Suatu angka " + angka);

        int tebakan;
        boolean kondisi = true;

        while (kondisi){
            for (tebakan=0; tebakan <= 100; tebakan++){
                System.out.println("Tebakan : " + tebakan);

                if (tebakan==angka){
                    kondisi = false;
                } else {
                    kondisi = true;
                }
            }




        }
    }
}
