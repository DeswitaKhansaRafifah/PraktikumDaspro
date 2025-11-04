package jobsheet8;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPelangganSemua = 0;
        int totalItemGlobal = 0;

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");
        
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            
            int totalItemCabang = 0; 
            
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelangganCabang = sc.nextInt();

            for (int j = 1; j <= jumlahPelangganCabang; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int itemDipesan = sc.nextInt();
                
                totalItemCabang += itemDipesan;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelangganCabang + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            totalPelangganSemua += jumlahPelangganCabang;
            totalItemGlobal += totalItemCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganSemua + " orang");
        System.out.println("Item terjual: " + totalItemGlobal + " item");
    }
}