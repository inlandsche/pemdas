package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // Unary = operasi yang dilakukan pada satu variabel

        // unary + dan -
        int a = 1;
        System.out.println("ditambah tanda minus maka akan menjadi " + -a);
        System.out.println("ditambah tanda plus maka akan menjadi " + +a);

        // unary decrement dan increment
        int b = 11;
        b++;
        b++;
        System.out.println();
        System.out.println("ditambah dua kali plus '++' akan menjadi " + b);
        // simbol ++ menambah satu angka

        int c = 69;
        c--;
        System.out.println();
        System.out.println("ditambah dua kali minus '--' akan menjadi " + c);
        // simbol -- mengurangi satu angka

        // prefix (++x) dan postfix (x++)
        System.out.println();
        System.out.println("Prefix");

        int d = 7;
        System.out.println("ditambah dua kali plus '++' akan menjadi " + ++d); //dieksekusi dulu

        System.out.println();
        System.out.println("Postfix");

        int e = 7;
        System.out.println("ditambah dua kali plus '++' akan menjadi " + d++); //masih delapan / print dulu
        System.out.println("ditambah dua kali plus '++' akan menjadi " + d); //baru nambah 1


        // unary boolean ! untuk negasi
        System.out.println();
        boolean AkuCintaDia = true;
        System.out.println("Nilai boolean = " + AkuCintaDia);
        System.out.println("Nilai boolean bernegasi = " + !AkuCintaDia);
    }
}
