package com.tutorial;

public class Main {

    public static void main(String[] args) {
        boolean a,b,c;

        // OPERASI LOGIKA

        // OR (||) --> penjumlahan
        System.out.println("---- OR ----");
        a = false;
        b = false;
        c = a || b;
        System.out.println( a + " || " + b + " = " + c );

        a = false;
        b = true;
        c = a || b;
        System.out.println( a + " || " + b + " = " + c );

        a = true;
        b = false;
        c = a || b;
        System.out.println( a + " || " + b + " = " + c );

        a = true;
        b = true;
        c = a || b;
        System.out.println( a + " || " + b + " = " + c );

        // AND (&&) --> perkalian
        System.out.println();
        System.out.println("---- AND ----");
        a = false;
        b = false;
        c = a && b;
        System.out.println( a + " && " + b + " = " + c );

        a = false;
        b = true;
        c = a && b;
        System.out.println( a + " && " + b + " = " + c );

        a = true;
        b = false;
        c = a && b;
        System.out.println( a + " && " + b + " = " + c );

        a = true;
        b = true;
        c = a && b;
        System.out.println( a + " && " + b + " = " + c );

        // XOR (^)
        System.out.println();
        System.out.println("---- XOR ----");
        a = false;
        b = false;
        c = a ^ b;
        System.out.println( a + " ^ " + b + " = " + c );

        a = false;
        b = true;
        c = a ^ b;
        System.out.println( a + " ^ " + b + " = " + c );

        a = true;
        b = false;
        c = a ^ b;
        System.out.println( a + " ^ " + b + " = " + c );

        a = true;
        b = true;
        c = a ^ b;
        System.out.println( a + " ^ " + b + " = " + c );

        // NEGASI (!)
        System.out.println();
        System.out.println("---- NEGASI ----");
        a = true;
        c = !a;
        System.out.println("Negasi (!) " + a + " adalah " + c);
        
        a = false;
        c = !a;
        System.out.println("Negasi (!) " + a + " adalah " + c);

    }
}
