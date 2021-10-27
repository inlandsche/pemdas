package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner anjay = new Scanner(System.in);
        double a;
        char b;

        System.out.print("Input nilai a: ");
        a = anjay.nextDouble();

        if (a%3==0){
            System.out.println("Yeayy");
        }
        else {
            System.out.println("Yoo");
        }


    }
}
