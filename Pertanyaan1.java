import java.util.Scanner;

public class Pertanyaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double a = 0, b = 0, c = 0;
        boolean ValidInput = false;

        while (!ValidInput) {
            try {
                System.out.println("Masukkan angka pertama: ");
                a = Double.parseDouble(sc.nextLine());
                System.out.println("Masukkan angka kedua: ");
                b = Double.parseDouble(sc.nextLine());
                System.out.println("Masukkan angka ketiga: ");
                c = Double.parseDouble(sc.nextLine());
                ValidInput = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka saja.\n");
            }
        }

        double min = Math.min(a, Math.min(b,c));

        int countMin = 0;
        if (a == min) countMin++;
        if (b == min) countMin++;
        if (c == min) countMin++;

        System.out.println("\n== Hasil===");
        if (countMin > 1) {
            System.out.println("Ada berapa angka kecil yaitu: ");
            if (a == min);
            System.out.println( a + " ");
            if (b == min);
            System.out.println( b + " ");
            if (c == min);
            System.out.println( c + " ");
                System.out.println();
        }
        else {
            System.out.println("Angka terkecil adalah: " + min);
        }

        sc.close();
    }
}