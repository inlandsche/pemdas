package com.tutorial;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
	    int n = in.nextInt();
        int[] inp = new int[n];
        input(inp);

        int adakah = in.nextInt();

	    ada(adakah, inp);
    }

    static void input(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
    }

    static void ada(int x, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % x == 0){
                System.out.println("Ada");
                break;
            }
            else if(i == arr.length - 1) {
                if(arr[arr.length - 1] % x == 0) System.out.println("Ada");
                else System.out.println("Tidak Ada");
            }


        }
    }
}
