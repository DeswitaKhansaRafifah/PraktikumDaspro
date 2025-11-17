package jobsheet9;

import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah;

        System.out.print("Masukkan jumlah pesanan: ");
        jumlah = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlah];
        double[] hargaPesanan = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));

            System.out.print("Nama makanan/minuman : ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Harga : ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\n======DAFTAR PESANAN======");

        double total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
            total += hargaPesanan[i];
        }

        System.out.println("------------------------------");
        System.out.println("Total biaya: Rp " + total);
    }
    
}
