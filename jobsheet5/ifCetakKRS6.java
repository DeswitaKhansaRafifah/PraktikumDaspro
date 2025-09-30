package jobsheet5;

import java.util.Scanner;
    public class ifCetakKRS6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uktLunas;

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        uktLunas = sc.nextBoolean();
        
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        }
    }
}
