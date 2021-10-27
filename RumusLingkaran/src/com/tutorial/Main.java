package com.tutorial;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Silahkan Masukkan Jari-Jari Lingkaran");

    double r = input.nextDouble();
	double phi;
	double L;

	if (r%7==0){
	    phi = (double) 22 / 7;
	    L = phi * r * r;
        System.out.println("Luas Lingkaran");
        System.out.println(L);
    }
	else {
	    phi = 3.14;
	    L = phi * r * r;
        System.out.println("Luas Lingkaran");
        System.out.println(L);
    }

    }
}
