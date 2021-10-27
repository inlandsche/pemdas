package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    float a,b;

        System.out.print("Nilai mmol : ");
	    a = input.nextFloat();

	    b = (float) (a / 1000);
        System.out.println("Hasil : " + b + " mol");
    }
}
