package jobsheet9;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += nilai[i];
        }
        double rata2 = (double) total / n;

        int max = nilai[0];
        int min = nilai[0];

        for (int i = 1; i < n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("Nilai rata-rata   : " + rata2);
        System.out.println("Nilai tertinggi   : " + max);
        System.out.println("Nilai terendah    : " + min);

    }
}
