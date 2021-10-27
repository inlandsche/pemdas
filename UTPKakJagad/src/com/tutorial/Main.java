package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String huruf, nya, hapus = "";

        huruf = in.nextLine();
        nya = in.nextLine();

        nya = nya.toUpperCase();
        huruf = huruf.toUpperCase();

        int panjang1 = nya.length();

            if (panjang1>100){
                System.out.println("error");
            }
            else {
               hapus = nya.replace(huruf,"");
               int panjang2 = hapus.length();

               int panjangtot = panjang1 - panjang2;
                    if (panjangtot%2==0) System.out.println("Ya");
                    else System.out.println("Tidak");
               }

            }
    }

