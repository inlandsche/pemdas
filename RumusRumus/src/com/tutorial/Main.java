package com.tutorial;

import java.util.*;


public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int pilihan = in.nextInt();

        boolean k = true;

        
            switch (pilihan) {
                case 1:
                    menuKeliling();
                    inputMenuKeliling();
                    break;
                case 2:
                    menuLuas();
                    inputMenuLuas();
                    break;
                case 3:
                    menuVolume();
                    inputMenuVolume();
                    break;
            }

    }

    static void menu() {
        System.out.println("RUMUS-RUMUS");
        System.out.println();
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        System.out.println("3. Volume");
        System.out.println();
        System.out.print("Silahkan pilih (1/2/3) : ");
    }

    static void menuKeliling() {
        System.out.println("Keliling");
        System.out.println();
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println();
        System.out.print("Silahkan pilih : ");
    }

    static void menuLuas() {
        System.out.println("Luas");
        System.out.println();
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println();
        System.out.print("Silahkan pilih : ");
    }

    static void menuVolume() {
        System.out.println("Volume");
        System.out.println();
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println();
        System.out.print("Silahkan pilih : ");
    }

    static void inputMenuKeliling() {
        int pilih = in.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Keliling Persegi");
                System.out.println();
                System.out.print("Panjang sisi (cm) : ");
                double sisi = in.nextDouble();
                System.out.printf("Keliling Persegi = %.2f cm", 6 * sisi);
                break;
            case 2:
                System.out.println("Keliling Persegi Panjang");
                System.out.println();
                System.out.print("Panjang (cm) : ");
                double p = in.nextDouble();
                System.out.print("Lebar (cm) : ");
                double l = in.nextDouble();
                System.out.printf("Keliling Persegi Panjang = %.2f cm", 2 * (p + l));
                break;
            case 3:
                System.out.println("Keliling Lingkaran");
                System.out.println();
                System.out.print("Jari-jari (cm) : ");
                double r = in.nextDouble();
                double phi = 0;
                if (r % 7 == 0) phi = 22 / 7.0;
                else phi = 3.14;
                System.out.printf("Keliling Lingkaran = %.2f cm", 2 * phi * r);
                break;
            default:
                System.out.println("error");
        }
    }

    static void inputMenuLuas() {
        int pilih = in.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Luas Persegi");
                System.out.println();
                System.out.print("Panjang sisi (cm) : ");
                double sisi = in.nextDouble();
                System.out.printf("Luas Persegi = %.2f cm^2", sisi * sisi);
                break;
            case 2:
                System.out.println("Luas Persegi Panjang");
                System.out.println();
                System.out.print("Panjang (cm) : ");
                double p = in.nextDouble();
                System.out.print("Lebar (cm) : ");
                double l = in.nextDouble();
                System.out.printf("Luas Persegi Panjang = %.2f cm^2", p * l);
                break;
            case 3:
                System.out.println("Luas Lingkaran");
                System.out.println();
                System.out.print("Jari-jari (cm) : ");
                double r = in.nextDouble();
                double phi = 0;
                if (r % 7 == 0) phi = 22 / 7.0;
                else phi = 3.14;
                System.out.printf("Luas Lingkaran = %.2f cm^2", phi * r * r);
                break;
            default:
                System.out.println("error");
        }
    }

    static void inputMenuVolume() {
        int pilih = in.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Volume Kubus");
                System.out.println();
                System.out.print("Panjang sisi (cm) : ");
                double sisi = in.nextDouble();
                System.out.printf("Volume Kubus = %.2f cm^3", sisi * sisi * sisi);
                break;
            case 2:
                System.out.println("Volume Balok");
                System.out.println();
                System.out.print("Panjang (cm) : ");
                double p = in.nextDouble();
                System.out.print("Lebar (cm) : ");
                double l = in.nextDouble();
                System.out.print("Tinggi (cm) : ");
                double t = in.nextDouble();
                System.out.printf("Volume Balok = %.2f cm^3", p * l * t);
                break;
            case 3:
                System.out.println("Volume Bola");
                System.out.println();
                System.out.print("Jari-jari (cm) : ");
                double r = in.nextDouble();
                double phi = 0;
                    if (r % 7 == 0) phi = 22 / 7.0;
                    else phi = 3.14;
                System.out.printf("Volume Bola = %.2f cm^3", (4/3.0) * (phi * r * r * r));
                break;
            default:
                System.out.println("error");
        }
    }
}
