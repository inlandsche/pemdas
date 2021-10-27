package com.tutorial;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    static void penjumlahan(){
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println(a + b);
    }

    static int plus(int a, int b){
        return a+b;         // harus direturn
    }

    public static void main(String[] args) {
        System.out.println(plus(15,12));

        penjumlahan();
    }
}
