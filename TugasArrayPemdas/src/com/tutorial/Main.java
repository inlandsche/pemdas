package com.tutorial;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arrayLong = in.nextInt();

        int [] arraySatu = new int[arrayLong];
        int [] arrayDua = new int[arrayLong];

        int [] arrayTambah = new int[arrayLong];
        int [] arrayKurang = new int[arrayLong];
        int [] arrayKali = new int[arrayLong];
        int [] arrayBagi = new int[arrayLong];


        for (int i = 0; i < arrayLong; i++){
            arraySatu[i] = in.nextInt();

        }

        for (int j = 0; j < arrayLong; j++){
            arrayDua[j] = in.nextInt();
        }

        for (int k = 0; k < arrayLong; k++){
            arrayTambah [k] = arraySatu[k] + arrayDua[k];

            System.out.print(arrayTambah[k] + " ");
        }

        System.out.println();

        for (int k = 0; k < arrayLong; k++) {
            arrayKurang[k] = arraySatu[k] - arrayDua[k];

            System.out.print(arrayKurang[k] + " ");
        }

        System.out.println();

        for (int k = 0; k < arrayLong; k++) {
            arrayKali[k] = arraySatu[k] * arrayDua[k];

            System.out.print(arrayKali[k] + " ");
        }

        System.out.println();

        for (int k = 0; k < arrayLong; k++) {
            arrayBagi[k] = arraySatu[k] / arrayDua[k];

            System.out.print(arrayBagi[k] + " ");
        }


    }

}