package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama, ultah, ucapan;
        int i;
        boolean kond = true;

        ucapan = "HBD Cuuuuuk";

        while (kond) {

            System.out.print("Namamu : ");
            nama = in.nextLine();

            System.out.print("Lagi ultah ya : ");
            ultah = in.nextLine();
            if (ultah.equals("ya")) {
                for (i = 0; i < 999; i++) {
                    System.out.println(ucapan);
                }
            } else if (ultah.equals("tidak")) {
                System.out.println("Owhhhh");
            } else {
                System.err.println("error");
            }

            System.out.println();
            System.out.println("Lanjut? ya/tidak ");
            String yes = in.nextLine();
            if (yes.equals("ya")) kond = true;
            else if (yes.equals("tidak")) kond = false;

        }


    }
}
