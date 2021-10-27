package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

//        System.out.print("Masukkan jam : ");
//        int jam = i.nextInt();
//
//        if (jam%3==0 && jam%5==0) System.out.println("Dorr");
//        else if (jam%3==0) System.out.println("Dhuarr");
//        else if (jam%5==0) System.out.println("Dum Dum");
//        else System.err.println("Tidak berbunyi");

        int k1, k2, n, z;

        k1 = i.nextInt();
        k2 = i.nextInt();
        n = i.nextInt();

        if ((n<=30 && n>0) && k1>0 && k2>0 && k1!=k2) {
            for (z = 1; z <= n; z++) {
                if (z % k1 == 0 && z % k2 == 0) System.out.println("Dorr");
                else if (z % k1 == 0) System.out.println("Duarr");
                else if (z % k2 == 0) System.out.println("Dum Dum");
                else System.out.println(z);
            }

        } else System.err.println("Error");




    }
}
