import java.util.*;
import java.lang.Math;

package com.tutorial;

public class Main {
    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        int r;
        double L;
        double phi;

        System.out.println("Silahkan input panjang jari-jari");
        r = input.nextInt();
        if (r==7){
            phi = (double) 22/7;
            L = phi * Math.pow(r,2);
            System.out.println("Maka luas lingkaran tersebut adalah "+ L);

        } else {
            phi = 3.14;
            L = phi * Math.pow(r,2);
            System.out.println("Maka luas lingkaran tersebut adalah "+ L);
        }
    }
}
