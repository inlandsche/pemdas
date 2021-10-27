package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String inputText = in.nextLine();
        char hurufAwal = inputText.charAt(0);
        char hurufKedua = inputText.charAt(1);
        char hurufTerakhir = inputText.charAt(inputText.length()-1);

        int hurufGabungan = (hurufKedua + hurufTerakhir);
        String gabungan = String.valueOf(hurufGabungan);
        System.out.println(gabungan);
        //String hilang = inputText.replace(hurufGabungan, "");

        int ubahHuruf = (int) hurufAwal;

        //System.out.printf("%d%s%s%s%s", ubahHuruf,hurufTerakhir, hurufGabungan, hurufKedua);


    }


}
