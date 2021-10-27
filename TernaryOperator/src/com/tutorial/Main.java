package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, luas, phi, jari;

        System.out.print("Masukkan jari-jari: ");
        r = input.nextDouble();

        // Operator Ternary, bentuk sederhana dari if else
        jari = (r%7==0) ? (phi = (double) 22/7) : (phi = 3.14);
        // if = () ? true : false;

        // Jika dengan if else
           /* if (r%7==0){
                phi = (double) 22/7;
                luas = phi * Math.pow(r,2);
            } else {
                phi = 3.14;
                luas = phi * Math.pow(r,2);
            } */



          luas = phi * Math.pow(r,2);
          System.out.printf("Luas: %.2f", luas);

    }
}
