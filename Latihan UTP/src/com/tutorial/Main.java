package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner pi = new Scanner(System.in);

        String cuaca, suhu, kelembaban, angin, hari, mood;
        int kondisi1, kondisi2, kondisi3, kondisi4, kondisi5, kondisi6;

        cuaca = pi.nextLine();

        switch (cuaca){
            case "cerah"   : kondisi1 = 1; break;
            case "mendung" : kondisi1 = 1; break;
            default        : kondisi1 = 0; break;
        }

        suhu = pi.nextLine();

        switch (suhu){
            case "panas"   : kondisi2 = 0; break;
            case "sedang" : kondisi2 = 1; break;
            default        : kondisi2 = 0; break;
        }

        kelembaban = pi.nextLine();

        switch (kelembaban){
            case "tinggi"   : kondisi3 = 0; break;
            case "normal" : kondisi3 = 1; break;
            default        : kondisi3 = 0; break;
        }

        angin = pi.nextLine();

        switch (angin){
            case "labil"   : kondisi4 = 0; break;
            default        : kondisi4 = 1; break;
        }

        hari = pi.nextLine();

        switch (hari){
            case "pagi"   : kondisi5 = 1; break;
            case "siang" : kondisi5 = 1; break;
            default        : kondisi5 = 0; break;
        }

        mood = pi.nextLine();

        switch (mood){
            case "bagus"   : kondisi6 = 1; break;
            case "buruk"   : kondisi6 = 0; break;
            default        : kondisi6 = 0; break;
        }

        int kondisiAkhir = kondisi1+kondisi2+kondisi3+kondisi4+kondisi5+kondisi6;

        Boolean x1 = cuaca.equals("cerah") && suhu.equals("panas") && hari.equals("siang");
        Boolean x2 = suhu.equals("sedang") && angin.equals("labil");
        Boolean x3 = cuaca.equals("hujan");

            if (mood.equals("bagus"))
                System.out.println("Toni pergi berlatih");
            else if (x3)
                System.out.print("Toni tidak pergi berlatih");
            else if (x2)
                System.out.print("Toni pergi berlatih");
            else if (x1)
                System.out.print("Toni tidak pergi berlatih");
            else if (kondisiAkhir>=3) System.out.print("Toni pergi berlatih");
                else System.out.print("Toni tidak pergi berlatih");

    }
}
