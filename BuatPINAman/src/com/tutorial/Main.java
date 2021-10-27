package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tgl;
        int pin;
        Boolean kondisi = true;

        System.out.print("Masukkan tanggal lahir (dd/mm/yyyy) : ");
        tgl = in.nextLine();

        String tanggal = tgl.substring(0,2);
        String bulan = tgl.substring(3,5);
        String tahun = tgl.substring(8,10);

        int nat = Integer.parseInt(tanggal + bulan + tahun);

        System.out.println();

        while (kondisi) {

        System.out.print("Buat sebuah PIN : ");
        pin = in.nextInt();

        String panjangPin = String.valueOf(pin);
        int maksimal = panjangPin.length();

        if (maksimal!=6) {
            System.out.println("PIN harus 6 digit");

        } else

            if (pin == nat) System.out.println("PIN tidak aman!");
            else if (pin == 123456 || pin == 654321) System.out.println("PIN dilarang!");
            else {
                System.out.println("Berhasil membuat PIN");
                kondisi = false;
            }
        }






    }
}
