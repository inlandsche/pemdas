package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    String a = "ABCDEFG";
//        System.out.println(a.length()); // jumlah digit pada string a
//        System.out.println(a.charAt(0)); // print digit ke 0, yaitu A
//        System.out.println(a.charAt(a.length()/2)); // mencari huruf tengah jika ganjil

        System.out.println("MENCARI TAHUN ANGKATAN");
        Scanner inp = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan NIM : ");
        String NIM = inp.nextLine();
        String x = NIM.substring(0,2);

        System.out.printf("Kamu angkatan 20%s",x);

    }
}
