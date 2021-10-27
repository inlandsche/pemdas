package com.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];

        // input isi array atau matriks
        inputArray(m1);
        inputArray(m2);

        // perkalian
        int[][] hasilKali = new int[2][2];

        hasilKali[0][0] = (m1[0][0] * m2[0][0]) + (m1[0][1] * m2[1][0]);
        hasilKali[0][1] = (m1[0][0] * m2[0][1]) + (m1[0][1] * m2[1][1]);
        hasilKali[1][0] = (m1[1][0] * m2[0][0]) + (m1[1][1] * m2[1][0]);
        hasilKali[1][1] = (m1[1][0] * m2[0][1]) + (m1[1][1] * m2[1][1]);

        printArray(hasilKali);
        
    }

    static void inputArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] = in.nextInt();
            }
        }
    }

    static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
