import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int saldo = 10000000;

        System.out.println("Selamat Datang Di ATM Sederhana Kelompok 15");
        System.out.println("Silahkan Masukkan Kartu Anda");
        System.out.println("Silahkan Masukkan Pin ATM Anda (Type Your Secret Number): ");
        int a=scan.nextInt();

        while (true) {
            System.out.println("Silahkan Pilih Jenis Transaksi (Select Type Of Transaction)");
            System.out.println("1. Penarikan Tunai \n2. Transfer \n3. Cancel \n Saat Ini Saldo Anda : Rp" + saldo);

            int i=scan.nextInt();

            while (i <= 0) {
                System.out.println("Angka yang Anda masukkan tidak sesuai.");
                System.out.println("Silahkan ulangi proses transaksi.");
            }

            if (i == 1) {
                System.out.println("Masukkan jumlah penarikan uang");
                int u = scan.nextInt();
                while (u <= 1500000) {
                    saldo = saldo - u;
                    System.out.println("Silahkan ambil uang Anda yang berjumlah " + u);
                    System.out.println("Transaksi Selesai. Silahkan ambil Kartu Anda.");
                    System.out.println();
                    break;
                }
                while (u > 1500000) {
                    System.out.println("Mohon maaf. Maksimal pengambilan sebesar Rp1.500.000,00");
                    System.out.println("Silahkan ulangi proses transaksi.");
                    System.out.println();
                    break;
                }
            }
            else if (i == 2) {
                System.out.println("Silahkan masukkan nomor rekening tujuan");
                int r = scan.nextInt();
                while (r >= 0) {
                    System.out.println("Silahkan masukkan jumlah uang yang akan dikirim ");
                    int c = scan.nextInt();
                    if (c >= 0) {
                        saldo = saldo - c;
                        System.out.println("Transaksi Sedang Diproses \n \nTransaksi Berhasil. Silahkan ambil struk dan kartu Anda.");
                        break;
                    }
                    break;
                }
            }

            else if (i == 3) {
                System.out.println("Proses Dibatalkan. Silahkan ambil kartu Anda");
                System.out.println();
                System.out.println("Terimakasih Telah Mengunjungi ATM Sederhana Kelompok 15.");
                break;
            }
        }


    }
}

