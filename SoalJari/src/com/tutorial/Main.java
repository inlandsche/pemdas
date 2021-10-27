package com.tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);

	    int firstNumber = in.nextInt();
	    int lastNumber = in.nextInt();

	    String[] jari = {"telunjuk", "jempol", "telunjuk", "tengah", "manis", "kelingking", "manis", "tengah"};

		ArrayList<String> finger = new ArrayList<String>();

		int selisih = lastNumber - firstNumber;

	    for (int i = 1; i <= selisih + 1; i++){
			finger.add(jari[(i % 8)]);
		}

		System.out.println(finger.get(finger.size() - 1));



    }
}
