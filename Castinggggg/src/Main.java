import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner up = new Scanner(System.in);
        double a,b,c;
        int hasil;

        System.out.print("Nilai a: ");
        a = up.nextDouble();
        System.out.print("Nilai b: ");
        b = up.nextDouble();

        c = a + b;
        hasil = (int) c;
        System.out.println("Hasil = " + c);
    }
}
