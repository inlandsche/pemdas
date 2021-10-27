package com.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] number = {1, 2, 4, 6, 4, 5, 5};



	    int[] total = new int[number.length];

	        for (int i = 0; i < number.length; i++){

				int mode = 0;

	            for (int j = 0; j < number.length; j++){
	               if(number[i] == number[j]){
	                   mode++;
	                   total[i] = mode;
                   }
                }
            }

		ArrayList<Integer> totall = new ArrayList<Integer>();

	        for (int i = 0; i < total.length; i++){
	        	totall.add(total[i]);
			}

		Collections.sort(totall);

        System.out.println();
    }
}
