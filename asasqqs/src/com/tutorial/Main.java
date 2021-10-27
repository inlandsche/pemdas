package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float usia;
        Scanner umur = new Scanner(System.in);

        System.out.println("REKOMENDASI TONTONAN");
        System.out.print("Masukkan usia anda : ");
        usia = umur.nextFloat();

        if (usia<10){
            System.out.println("Nonton kartun aja, dek ");
        }
        else if (usia>10 && usia<17){
            System.out.println("Nonton ruangguru aja, sob ");
        }
        else if (usia>18 && usia<99){
            System.out.println("Nonton sakarepmu, sing penting eling ");
        }
        else if (usia>99){
            System.out.println("Inalilahi");
        }
    }
}
