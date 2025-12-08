package jobsheet11;

import java.util.Scanner;
public class RekapPenjualanCafe6 {
    static void inputDataPenjualan(int[][] penjualan, String[] namaMenu, int jumlahMenu, int jumlahHari) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("\nMenu: " + namaMenu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilDataPenjualan(int[][] penjualan, String[] namaMenu, int jumlahMenu, int jumlahHari) {
        System.out.println("\n=== REKAP PENJUALAN KAFE ===");
        System.out.print("Menu\t\t\t");
        for (int j = 0; j < jumlahHari; j++) {
            System.out.print("Hari " + (j + 1) + "\t");
        }
        System.out.println();
        System.out.println("=".repeat(80));
        
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(namaMenu[i]);
    
            if (namaMenu[i].length() < 16) {
                System.out.print("\t\t");
            } else {
                System.out.print("\t");
            }
            
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    static void menuPenjualanTertinggi(int[][] penjualan, String[] namaMenu, int jumlahMenu, int jumlahHari) {
        int indexTertinggi = 0;
        int totalTertinggi = 0;
        
        for (int i = 0; i < jumlahMenu; i++) {
            int totalMenu = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalMenu += penjualan[i][j];
            }
            
            if (totalMenu > totalTertinggi) {
                totalTertinggi = totalMenu;
                indexTertinggi = i;
            }
        }
        
        System.out.println("\n=== MENU PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + namaMenu[indexTertinggi]);
        System.out.println("Total Penjualan: " + totalTertinggi + " porsi");
    }
    
    static void rataRataPenjualan(int[][] penjualan, String[] namaMenu, int jumlahMenu, int jumlahHari) {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");
        
        for (int i = 0; i < jumlahMenu; i++) {
            int totalMenu = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalMenu += penjualan[i][j];
            }
            double rataRata = (double) totalMenu / jumlahHari;
            System.out.printf("%s: %.2f porsi/hari\n", namaMenu[i], rataRata);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();
        
        String[] namaMenu = new String[jumlahMenu];
        
        System.out.println("\n=== INPUT NAMA MENU ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }
        
        int[][] penjualan = new int[jumlahMenu][jumlahHari];
        
        inputDataPenjualan(penjualan, namaMenu, jumlahMenu, jumlahHari);
        tampilDataPenjualan(penjualan, namaMenu, jumlahMenu, jumlahHari);
        menuPenjualanTertinggi(penjualan, namaMenu, jumlahMenu, jumlahHari);
        rataRataPenjualan(penjualan, namaMenu, jumlahMenu, jumlahHari);
        
    }
    
}