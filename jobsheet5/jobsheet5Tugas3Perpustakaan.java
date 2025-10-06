package jobsheet5;

import java.util.Scanner;
public class jobsheet5Tugas3Perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean kartuMahasiswa, registrasiOnline;

        System.out.println("--- Sistem Perpustakaan Kampus ---");
        System.out.println("Apakah mahasiswa membawa kartu mahasiswa? (true/false): ");
        kartuMahasiswa = sc.nextBoolean();
        System.out.println("Apakah mahasiswa sudah melakukan registrasi online? (true/false): ");
        registrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Boleh masuk perpustakaan");
        } else {
            System.out.println("Ditolak masuk perpustakaan");
        }
    }
    
}
