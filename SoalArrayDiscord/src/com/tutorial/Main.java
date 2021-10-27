package com.tutorial;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    // link : https://www.hackerrank.com/contests/utp-discord-filkom-ub/challenges/aim-lab-bangjago/problem

    public static void main(String[] args) {

        int hasilnyaHuda = 0, hasilnyaForga = 0;

        int totalMatch = in.nextInt();

        int [] Huda = new int[totalMatch];
        int [] Forga = new int[totalMatch];

        for (int i = 0; i < totalMatch; i++){
            Huda [i] = in.nextInt();
        }

        for (int i = 0; i < totalMatch; i++){
            Forga [i] = in.nextInt();
        }

        for (int i = 0; i < totalMatch; i++){
            if (Huda[i] > Forga[i]) hasilnyaHuda++;
            else if (Huda[i] < Forga [i]) hasilnyaForga++;
            else {
                hasilnyaHuda = hasilnyaHuda;
                hasilnyaForga = hasilnyaForga;
            }
        }

        System.out.printf("Huda : %d - %d : Forga", hasilnyaHuda, hasilnyaForga);

    }
}
