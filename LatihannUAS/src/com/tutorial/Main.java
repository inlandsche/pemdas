package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for(int i = 0; i < N; i++){

            for(int k = N-1; k > i; k--){
                System.out.print("x ");
            }

            for(int j = 0; j <= i; j++){
                System.out.print("o ");
            }


            System.out.println();
        }

    }

}
