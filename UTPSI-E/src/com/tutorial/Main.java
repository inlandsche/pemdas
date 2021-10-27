package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        int bb, target, detik, jarak;
        double met;

        bb = p.nextInt();
        target = p.nextInt();
        detik = p.nextInt();
        jarak = p.nextInt();

        int jam, menit, sisaMenit, sisaDetik;

        menit = detik/60;
        jam = detik/3600;
        sisaMenit = menit%60;
        sisaDetik = detik%60;

        System.out.printf("%.2d:%.2d:%.2d \n" , jam, sisaMenit, sisaDetik);

        double kecepatan = Math.round(jarak/jam);

        if (kecepatan<=4) met = 6;
        else if (kecepatan==5) met = 8.3;
        else if (kecepatan==6) met = 9.8;
        else if (kecepatan==7) met = 11;
        else met = 11.8;

        
    }
}
