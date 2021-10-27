package com.tutorial;

import java.util.Scanner;

public class Main {


    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int total = in.nextInt();

        String[] nama = new String[total];
        int[] usia = new int[total];

        in.nextLine();

        for (int i = 0; i <= total; i++) {
            nama[i] = in.nextLine();
        }

        for (int i = 0; i <= total; i++) {
            usia[i] = in.nextInt();
        }

        int baris = in.nextInt();

        System.out.println("Nama : " + nama[baris-1]);
        System.out.println("Umur : " + usia[baris-1]);

    }
}


//    public static void main(String[] args) {
//
//        int [] list = new int[5];
//
//        inputArray(list);
//        printArray(list);
//
//    }
//
//    static void inputArray(int[] arraymu){
//        for (int i = 0; i < arraymu.length; i++){
//            arraymu [i] = in.nextInt();
//        }
//    }
//
//    static void printArray(int [] arraymu){
//        for (int i = 0; i < arraymu.length; i++){
//            System.out.print(arraymu[i] + " ");
//        }
//    }
//}
