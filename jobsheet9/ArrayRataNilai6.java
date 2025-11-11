package jobsheet9;

import java.util.Scanner;
public class ArrayRataNilai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int [] nilaiMhs = new int [jumlahMhs];
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        double totalLulus = 0, totalTidakLulus = 0;
        double rataLulus, rataTidakLulus;
        

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs [i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahMhs; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        rataLulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
        rataTidakLulus = (jumlahTidakLulus > 0) ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
    
}
