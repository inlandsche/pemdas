package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner p = new Scanner(System.in);

	    int pil, setoran, tarik;
	    int saldo = 0;
	    boolean kondisi = true;

	    while (kondisi) {

            System.out.println("1. Cek Saldo");
            System.out.println("2. Isi Saldo");
            System.out.println("3. Tarik Saldo");
            System.out.println("4. Exit");

            System.out.print("Pilih (1/2/3/4) : ");
            pil = p.nextInt();

            switch (pil){
                case 1 :
                    System.out.printf("Saldo Saat ini Adalah Rp. %d \n", saldo);
                    break;
                case 2 :
                    System.out.printf("Saldo Saat ini Adalah Rp. %d \n", saldo);
                    System.out.print("Jumlah Saldo yang ingin Anda Setorkan : ");
                    setoran = p.nextInt();
                    saldo += setoran;
                    System.out.printf("Saldo Saat ini Adalah Rp. %d \n", saldo);
                    break;
                case 3 :
                    System.out.printf("Saldo Saat ini Adalah Rp. %d \n", saldo);
                    System.out.print("Jumlah Saldo yang ingin Anda Ambil : ");
                    tarik = p.nextInt();
                    if (tarik>saldo) {
                        System.out.println("Mohon Maaf Saldo Anda Tidak Mencukupi!!!");
                    }
                    else {
                        saldo -= tarik;
                        System.out.printf("Saldo Saat ini Adalah Rp. %d \n", saldo);
                    }
                    break;
                case 4 :
                    System.out.println("Terima Kasih");
                    kondisi = false;
                    break;
                default:
                    System.out.println("error");
            }

        }
    }
}
