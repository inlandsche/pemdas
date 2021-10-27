package com.tutorial;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        int [][] array2d = new int[5][3];
//
//        for(int i = 0; i < array2d.length; i++){
//            for(int j = 0; j < array2d[0].length; j++){
//                array2d[i][j] = in.nextInt();
//            }
//        }
//
//        for(int i = 0; i < array2d.length; i++){
//            for(int j = 0; j < array2d[0].length; j++){
//                System.out.print(array2d[i][j] + " ");
//            }
//
//            System.out.println();
//        }

        System.out.println(Math.floor( -5.5 ));

    }

    public static int ApaIni(int a, int b)
    {
        int x, y, r;
        x=a; y=b;
        while (y!=0)
        {	r= x%y;
            x=y; y=r;
        }
        return x;
    }









}
