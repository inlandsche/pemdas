package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner anjay = new Scanner(System.in);

        // Operator Assigment
        int a = 7;
        a = a + 5;
        System.out.println(a);
        // dapat disederhanakan menjadi (ibaratkan a=b)
        int b = 7;
        b += 5;
        System.out.printf("7 ditambah 5 adalah %d \n ", b);

        int c = 10;
        c %= 4;
        System.out.println("10 mod 4 =" + c);
        System.out.println();

        // Komparasi dengan boolean
        System.out.println("EQUAL");

        int x,y;
        boolean Komparasi,Komparasi2;


        x = 99;
        y = 100;

        Komparasi = (x==y);
        System.out.printf("%d == %d ---> %b \n ", x,y,Komparasi);
        // sama dengan perintah System.out.println(" 99 == 100 ---> " + Komparasi);

        System.out.println("GREATER/LESS THAN");
        x = 99;
        y = 100;

        Komparasi = (x>y);
        Komparasi2 = (x<y);
        System.out.printf("%d > %d ---> %b \n " , x,y,Komparasi);
        System.out.printf("%d < %d ---> %b \n " , x,y,Komparasi2);
    }
}
