package com.tutorial;

public class Main {

    public static void main(String[] args) {

        int nilaiI = 300;
        System.out.println("Nilai I = " + nilaiI);

        // Konversi nilai I ke tipe yang lebih luas/tinggi, misalnya int ke long

        long nilaiL = nilaiI;
        System.out.println("Nilai L = " + nilaiL);

        // Tidak menjadi sebuah masalah jika suatu nilai dikonversikan ke tipe yang lebih tinggi

        // Akan menjadi sebuah masalah jika suatu nilai dikonversikan ke tipe yang lebih rendah
        // Misalnya int ke byte, harus menggunakan casting (byte) sebelum nilai

        byte nilaiB = (byte) nilaiI;
        System.out.println("Nilai B = " + nilaiB);
        System.out.println("Nilai maksimum B = " + Byte.MAX_VALUE);

        // Output 44 karena nilai maksimum byte hanya sampai 127, sehingga nilainya muter lagi ke -128

        // Konversi pada aritmatika

        int a = 7;
        int b = 2;
        double c;

        c = (double) a / b;
        System.out.printf("%d / %d = %f\n ", a,b,c);
        System.out.println("Hasil dari 7/2 jika dicasting ke double adalah " + c);

        // Jika c tidak dicasting ke double maka hasilnya akan 3


        // Atau bisa juga seperti ini, salah satu tipe dianti dengan double/float
        double x = 7;
        int y = 2;

        double z = x / y;
        System.out.printf("%f / %d = %f \n", x,y,z);



    }
}
