package jobsheet5;

import java.util.Scanner;
public class jobsheet5Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisPengguna;
        int jumlahSKS;

        System.out.println("--- Pengecekan Wifi Kampus ---");
        System.out.println("Masukkan Jenis Pengguna: ");
        jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses Wifi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukkan jumlah SKS");
            jumlahSKS = sc.nextInt();

            if (jumlahSKS >= 12) {
                System.out.println("Akses Wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            } 
        } else {
            System.out.println("Akses ditolak");
        }
    }
    
}
