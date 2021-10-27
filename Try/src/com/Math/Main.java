package com.Math;

import java.util.*;
import java.lang.Math;

public class Main {
	private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	    int r;
	    double L;
	    double phi;

		System.out.println("Silahkan input jari-jari");
		r = input.nextInt();
		if (r%7==0){
			phi = (double) 22/7;
			L = phi*r*r;
			System.out.println("Luas Lingkaran");
			System.out.println(L);
		} else {
			phi = (double) 3.14;
			L = phi*r*r;
			System.out.println("Luas Lingkaran");
			System.out.println(L);
		}
    }
}
