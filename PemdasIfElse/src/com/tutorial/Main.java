package com.tutorial;

import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
	// If untuk percabangan
    // Math.sqrt untuk akar, Math.sqrt(a) = akar 2 a

        Scanner anjay = new Scanner(System.in);
        double a, b, c, d, x1, x2;

        System.out.println("==== PERHITUNGAN AKAR PERSAMAAN KUADRAT ====");
        System.out.print("Masukkan nilai a : ");
        a = anjay.nextDouble();
        System.out.print("Masukkan nilai b : ");
        b = anjay.nextDouble();
        System.out.print("Masukkan nilai c : ");
        c = anjay.nextDouble();

        d = b * b - 4 * a * c;

        if (d>=0){
            x1 = (-b+Math.sqrt(d)/2*a);
            x2 = (-b-Math.sqrt(d)/2*a);

            System.out.printf("x1 : %.3f \n x2 : &.3f \n", x1,x2);
        }
        else {
            System.out.println("Imajiner Woy, Susah");
        }






    }
}
