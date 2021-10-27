package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float phi, r, V;

        System.out.println("VOLUME BOLA");
        System.out.println();

        System.out.print("Jari - jari : ");
        r = input.nextFloat();

        if (r%7==0){
            phi = (float) (22 / 7);
            V = (4 * phi * r * r * r )/3;
            System.out.printf("Volume = %.2f ", V);
        }
        else {
            phi = (float) 3.14;
            V = (4 * phi * r * r * r )/3;
            System.out.printf("Volume = %.2f ", V);
        }
    }
}
