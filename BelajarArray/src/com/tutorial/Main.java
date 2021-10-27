package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a[] = {7, 1, 2};
        int b[] = {1, 2, 3, 4};
        int c[] = new int[5];


        // Menjumlahkan isi dalam array
         for (int i = 0; i < a.length; i++){
            a[i] = a[i] + b[i];
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++){
            if (i > a.length) a[i] += 0;
            else a[i] = a[i] + b[i];
            System.out.println(a[i]);
        }

        // Mengisi array c
      /*  for (int x = 0; x < c.length; x++){
            c[x] = in.nextInt();
        }
        for (int x = 0; x < c.length; x++){
            System.out.println(c[x]);
        } */

        // Array 2D
        // int d[][] = {{1,2},{3,4}}; // seperti matriks
//        int d[][] = {{1,2},
//                    {3,4,5}};
//        int e[][] = {{1,2},{3,4}};
//
//        System.out.println(d.length + " " + d[1].length); // d.length (banyaknya baris, yaitu dua)
//                                                          // d[1].length (banyaknya kolom di baris 1 yaitu tiga {3,4,5})
//        System.out.println();

        /*
        System.out.print(d[0][0]); // d baris 0 kolom 0 yaitu 1
        System.out.print(d[0][1]); // d baris 1 kolom 0 yaitu 2
        System.out.print(d[1][0]); // d baris 0 kolom 1 yaitu 3
        System.out.println(d[1][1]); // d baris 1 kolom 1 yaitu 4
        */

//        for (int i = 0; i < d.length; i ++){
//            for (int j = 0; j < d[0].length; j++){
//                //System.out.print(d[i][j] + " ");
//
//                // penjumlahan
//                d[i][j] = d[i][j] + e[i][j];
//                System.out.print(d[i][j] + " ");
//            }
//
//            System.out.println();
//        }
    }
}
