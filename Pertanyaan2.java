import java.util.Scanner;

public class Pertanyaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia = 0;
        double HR = 0;
        boolean valid = false;

       
        while (!valid) {
            try {
                System.out.print("Masukkan usia (tahun): ");
                usia = Integer.parseInt(sc.nextLine());

                System.out.print("Masukkan detak jantung saat latihan (HR): ");
                HR = Double.parseDouble(sc.nextLine());

                if (usia < 10 || usia > 100 || HR <= 0) {
                    System.out.println("Input tidak valid! Usia 10–100 tahun, HR harus positif.\n");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Harap masukkan angka yang valid!\n");
            }
        }

        // Hitung MHR dan %MHR
        double MHR = 220 - usia;
        double persenMHR = (HR / MHR) * 100;
        long persenBulat = Math.round(persenMHR); // dibulatkan ke bilangan bulat

        // menentukan kategori
        String kategori, saran;

        if (persenMHR < 50) {
            kategori = "Sangat ringan";
            saran = "Pemanasan, manfaat minimal.";
        } else if (persenMHR < 60) {
            kategori = "Ringan";
            saran = "Baik untuk peningkatan dasar kebugaran.";
        } else if (persenMHR < 70) {
            kategori = "Sedang";
            saran = "Zona aerobik nyaman.";
        } else if (persenMHR <= 85) {
            kategori = "Kuat";
            saran = "Meningkatkan kapasitas kardiorespirasi.";
        } else {
            kategori = "Sangat berat";
            saran = "Berisiko bagi pemula, batasi durasi latihan.";
        }

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Detak Jantung Maksimal (MHR): " + MHR);
        System.out.println("Persentase MHR: " + persenBulat + "%");
        System.out.println("Kategori: " + kategori);
        System.out.println("Saran: " + saran);

        sc.close();
    }
}