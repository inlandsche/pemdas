package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);

        String in, ni, xx = "", yy ="";
        int i = 0, j = 0;

        in = an.nextLine();
        ni = an.nextLine();

        in = in.toLowerCase();
        ni = ni.toLowerCase();

        for ( i = in.length(); i > 0; i--) {
            String x = in.substring(i-1, i);

            xx = xx + x;
        }

        System.out.println();

        for ( i = ni.length(); i > 0; i--) {
            String y = ni.substring(i-1, i);

            yy = yy + y;
        }

        System.out.println(xx);
        System.out.println(yy);

//        if (xx.equals(yy)) System.out.println("Sama");
//        else System.out.println("Tidak");

    }

}
