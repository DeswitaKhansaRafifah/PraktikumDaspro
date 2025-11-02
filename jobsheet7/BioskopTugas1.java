package jobsheet7;

import java.util.Scanner;
public class BioskopTugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah, hargaTiket = 50000, totalTiket = 0;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah == 0) break;
            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak valid! Input ulang!");
                continue;
            }

            double diskon = 0;
            if (jumlah > 10) diskon = 0.15;
            else if (jumlah > 4) diskon = 0.10;

            double total = jumlah * hargaTiket * (1 - diskon);
            totalPendapatan += total;
            totalTiket += jumlah;

            System.out.println("Total harga: Rp " + total);
        }

        System.out.println("\n=== LAPORAN PENJUALAN ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan  : Rp " + totalPendapatan);
    } 
}
