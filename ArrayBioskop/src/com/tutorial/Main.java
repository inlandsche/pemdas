package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int barisArray = in.nextInt();
        int kolomArray = in.nextInt();

        int banyakReservasi = in.nextInt();

        in.nextLine();

        String [][] kursi = new String[barisArray][kolomArray];


        for (int i = 0; i < barisArray; i++){
            for (int j = 0; j < kolomArray; j++){
                kursi [i][j] = "O ";
            }
        }

        for (int a = 0; a < banyakReservasi; a++){
            String kursiDipilih = in.nextLine();

            int x = Integer.parseInt(kursiDipilih.substring(0,1));
            int y = Integer.parseInt(kursiDipilih.substring(2));

            kursi[x][y] = "X ";
        }

        for (int i = 0; i < barisArray; i++){
            for (int j = 0; j < kolomArray; j++){
                System.out.print(kursi[i][j]);
            }

            System.out.println();

        }



    }
}
