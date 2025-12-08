package jobsheet11;

import java.util.Scanner;
public class NilaiMahasiswa6 {
    static void isianArray(int[] arrayNilai, int jumlahMahasiswa) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=== INPUT NILAI MAHASISWA ===");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] arrayNilai) {
        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arrayNilai[i]);
        }
    }
    
    static int hitTot(int[] arrayNilai) {
        int total = 0;
        for (int i = 0; i < arrayNilai.length; i++) {
            total += arrayNilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[N];
        
        isianArray(nilaiMahasiswa, N);
        tampilArray(nilaiMahasiswa);
        
        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\n=== TOTAL NILAI ===");
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
        System.out.println("Rata-rata nilai: " + (double)totalNilai / N);
    }
}