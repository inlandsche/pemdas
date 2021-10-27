package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	// Operator Bitwise --> operator untuk melakukan operasi pada nilai bit

		byte x = 3;
		byte y,z;
		String x_bits,y_bits,z_bits;

		// String.format mirip seperti printf, %8s artinya 8 digit
		x_bits = String.format("%8s", Integer.toBinaryString(x));
		System.out.printf("%s = %d \n", x_bits,x);

		// Menambahkan digit sebelum x_bits
		x_bits = String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
		System.out.printf("%s = %d \n", x_bits,x);

		// Operator Shift Left atau digeser ke kiri
		System.out.println("==== SHIFT LEFT ====");
		x_bits = String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
		System.out.printf("%s = %d \n", x_bits,x);
		// 1 = digeser sejumlah 1
		y = (byte)(x << 1);
		y_bits = String.format("%8s", Integer.toBinaryString(y)).replace(' ','0');
		System.out.printf("%s = %d \n", y_bits,y);

		// Operator Shift Right atau digeser ke kanan
		System.out.println("==== SHIFT RIGHT ====");

		x = 6;
		x_bits = String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
		System.out.printf("%s = %d \n", x_bits,x);

		y = (byte)(x >> 1);
		y_bits = String.format("%8s", Integer.toBinaryString(y)).replace(' ','0');
		System.out.printf("%s = %d \n", y_bits,y);

		// Operator OR Bitwise
		System.out.println("==== OR (|) ====");

		x = 6;
		x_bits = String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
		System.out.printf("%s = %d \n", x_bits,x);

		y = 3;
		y_bits = String.format("%8s", Integer.toBinaryString(y)).replace(' ','0');
		System.out.printf("%s = %d \n", y_bits,y);

		System.out.println("------------ or (ditambah)");

		z = (byte)(x | y);
		z_bits =String.format("%8s", Integer.toBinaryString(z)).replace(' ','0');
		System.out.printf("%s = %d \n", z_bits,z);

		// Operator AND Bitwise
		System.out.println("==== AND (&) ====");

		x = 6;
		x_bits = String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
		System.out.printf("%s = %d \n", x_bits,x);

		y = 3;
		y_bits = String.format("%8s", Integer.toBinaryString(y)).replace(' ','0');
		System.out.printf("%s = %d \n", y_bits,y);

		System.out.println("------------ and (dikali)");

		z = (byte)(x & y);
		z_bits =String.format("%8s", Integer.toBinaryString(z)).replace(' ','0');
		System.out.printf("%s = %d \n", z_bits,z);

		// Operator XOR Bitwise
		System.out.println("==== XOR (^) ====");

		x = 6;
		x_bits = String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
		System.out.printf("%s = %d \n", x_bits,x);

		y = 3;
		y_bits = String.format("%8s", Integer.toBinaryString(y)).replace(' ','0');
		System.out.printf("%s = %d \n", y_bits,y);

		System.out.println("------------ xor (eksklusif)");

		z = (byte)(x ^ y);
		z_bits =String.format("%8s", Integer.toBinaryString(z)).replace(' ','0');
		System.out.printf("%s = %d \n", z_bits,z);

		// Operator Negasi atau Not (~)
		System.out.println("==== NOT (~) ====");

		x = 24;
		y = (byte) (~x);
		x_bits = String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
		System.out.printf("%s = %d \n", x_bits,x);
		y_bits = String.format("%8s", Integer.toBinaryString(y)).replace(' ','0');
		System.out.printf("%s = %d \n", y_bits,y);
		// Substring untuk memperpendek digit
		y_bits = String.format("%8s", Integer.toBinaryString(y)).substring(24);
		System.out.printf("%s = %d \n", y_bits,y);

        }
    }

