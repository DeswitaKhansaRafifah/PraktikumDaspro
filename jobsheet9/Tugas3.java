package jobsheet9;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik",
            "Cappucino", "Chocolate Ice"
        };

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean found = false;
        int indexDitemukan = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                found = true;
                indexDitemukan = i;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Menu \"" + cari + "\" tersedia.");
            System.out.println("Ditemukan pada indeks ke-" + indexDitemukan);
        } else {
            System.out.println("Menu \"" + cari + "\" TIDAK ditemukan.");
        }
    }
    
}
