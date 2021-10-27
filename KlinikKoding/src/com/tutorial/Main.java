package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner anjay = new Scanner(System.in);
	/*Tipe data nonprimitif, ada fungsi tertentu
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim = scanner.nextLine();

        System.out.println(nama + "-" + nim);
        System.out.printf("%20s - %18s \n", nama,nim);
        // -20s artinya rata kiri pada 20 kolom
        System.out.printf("%-20s - %18s \n", nama,nim); */

        double celcius,fahrenheit;

        celcius = anjay.nextDouble();

        fahrenheit = (double) 9/5 * celcius + 32;

        System.out.printf("%.2f", fahrenheit);

    }
}
