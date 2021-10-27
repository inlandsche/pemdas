package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int detik;
	    int menit;
	    int jam;
		int sisaDetik;
		int sisaMenit;

        System.out.print("Masukkan detik : ");
	    detik = in.nextInt();

		jam = detik/3600;
		menit = detik/60;

		sisaMenit = menit%60;
		sisaDetik = detik%60;

		System.out.printf("%d jam %d menit %d detik ", jam, sisaMenit, sisaDetik);








    }
}
