package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner oo = new Scanner(System.in);

        System.out.println("==== KEDUDUKAN DUA LINGKARAN ====");

        int x1, x2, y1, y2, r1, r2, jarakx, jaraky;
        double jarakPusat;

        System.out.print("Nilai x1: "); x1 = oo.nextInt();
        System.out.print("Nilai x2: "); x2 = oo.nextInt();
        System.out.print("Nilai y1: "); y1 = oo.nextInt();
        System.out.print("Nilai y2: "); y2 = oo.nextInt();
        System.out.print("Nilai r1: "); r1 = oo.nextInt();
        System.out.print("Nilai r2: "); r2 = oo.nextInt();

        jarakx = x2 - x1;
        jaraky = y2 - y1;

        jarakPusat = Math.sqrt((jarakx * jarakx) + (jaraky * jaraky));

        if (jarakx<0) jarakx = jarakx * (-1);
        else jarakx = jarakx;
        if (jaraky<0) jaraky = jaraky * (-1);
        else jaraky = jaraky;

        if (jarakPusat==r1+r2){
            System.out.println("Bersinggungan di luar");
        } else if (jarakPusat==r1-r2){
            System.out.println("Bersinggungan di dalam");
        } else if (jarakPusat>(r1-r2) && jarakPusat<(r1+r2)){
            System.out.println("Berpotongan");
        } else {
            System.out.println("Saling lepas");
        }

    }
}
