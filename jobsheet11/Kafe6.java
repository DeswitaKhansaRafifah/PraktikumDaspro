package jobsheet11;

import java.util.Scanner;

public class Kafe6 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon spesial!");
        } else {
            System.out.println("Anda bukan member.");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Kode promo invalid!");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = hargaTotal * 50 / 100;
        } else if (kodePromo.equals("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
        } else {
            System.out.println("Kode promo invalid! Tidak ada diskon.");
        }

        System.out.println("Diskon diberikan: Rp " + diskon);
        return hargaTotal - diskon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true, "DISKON30");
        
        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        int totalSemuaPesanan = 0;

        for (int i = 1; i <= jumlahMenu; i++) {
            System.out.print("\nMasukkan nomor menu ke-" + i + ": ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();

            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc.nextLine();

            totalSemuaPesanan += hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        }

        System.out.println("\n==========================================");
        System.out.println("TOTAL KESELURUHAN PEMBAYARAN: Rp" + totalSemuaPesanan);
        System.out.println("Terima kasih telah berbelanja di Resto Kafe!");
    }

}