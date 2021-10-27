package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int kelipatan, i, batas;

        System.out.println("PERMAINAN KELIPATAN");

        System.out.println();
        System.out.print("Bilangan sampai ");
        batas = in.nextInt();
        System.out.print("Setiap kelipatan ");
        kelipatan = in.nextInt();
        System.out.println("Akan berubah menjadi tot");

        System.out.println("Hasilnyaa");

        for (i=1; i<=batas; i++){
            if (i%kelipatan==0) System.out.print(" tot ");
            else System.out.print(" " + i + " ");
        }

    }
}
