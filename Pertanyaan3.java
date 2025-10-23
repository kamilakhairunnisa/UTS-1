import java.util.Scanner;
public class Pertanyaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double omzet = 0;
        int rating = 0;
        String sertifikasi = "";
        boolean valid = false;

        // Input & Validasi
        while (!valid) {
            try {
                System.out.print("Masukkan omzet (Rp): ");
                omzet = Double.parseDouble(sc.nextLine());

                System.out.print("Masukkan rating (1-100): ");
                rating = Integer.parseInt(sc.nextLine());

                System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak): ");
                sertifikasi = sc.nextLine().trim().toLowerCase();

                if (omzet < 0 || rating < 1 || rating > 100 || 
                   (!sertifikasi.equals("ya") && !sertifikasi.equals("tidak"))) {
                    System.out.println("\nInput tidak valid! Coba lagi.\n");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("\nHarap masukkan angka yang valid.\n");
            }
        }

            double persenKomisi = 0;
        double jumlahKomisi = 0;
        double bonus = 0;

        // menghitung komisi
        if (rating < 70) {
            persenKomisi = 0;
            jumlahKomisi = 0;
        } else {
            // Tentukan persen awal berdasarkan omzet
            if (omzet < 50000000) {
                persenKomisi = 1;
            } else if (omzet < 100000000) {
                persenKomisi = 2;
            } else {
                persenKomisi = 3;
            }

            // Tambahan jika rating tinggi
            if (rating >= 90) {
                persenKomisi += 1; // tambah 1% absolut
            }

            jumlahKomisi = (persenKomisi / 100) * omzet;

             // Bonus sertifikasi
            if (sertifikasi.equals("ya")) {
                bonus = 500000;
            }
        }

        double total = jumlahKomisi + bonus;

        // output
        System.out.println("\n=== RINCIAN KOMISI PENJUALAN ===");
        System.out.println("Omzet               : Rp " + String.format("%,.0f", omzet));
        System.out.println("Rating              : " + rating);
        System.out.println("Sertifikasi         : " + sertifikasi);
        System.out.println("------------------------------------");
        System.out.println("Persentase Komisi   : " + persenKomisi + "%");
        System.out.println("Jumlah Komisi       : Rp " + String.format("%,.0f", jumlahKomisi));
        System.out.println("Bonus Sertifikasi   : Rp " + String.format("%,.0f", bonus));
        System.out.println("------------------------------------");
        System.out.println("Total Diterima      : Rp " + String.format("%,.0f", total));

        sc.close();

        
    }
    
}
