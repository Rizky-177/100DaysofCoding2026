public class day09 {
    public static void main(String[] args) {

        // KONSTANTA (FINAL VARIABLE)
        // Konstanta adalah variabel yang nilainya bersifat tetap.
        // Dalam Java, konstanta dibuat menggunakan kata kunci "final".
        // Setelah nilai diberikan, nilainya tidak dapat diubah lagi.

        // final double digunakan untuk membuat harga tetap
        final double HARGA = 15000;

        // Konstanta ini menyimpan nilai diskon sebesar 10%
        // Nilai DISKON tidak dapat diubah karena menggunakan final
        final double DISKON = 0.10;

        // Menghitung jumlah potongan harga
        double potongan = HARGA * DISKON;

        // Menghitung harga setelah mendapatkan diskon
        double hargaAkhir = HARGA - potongan;

        // Menampilkan hasil perhitungan ke layar
        System.out.println("===== HASIL PERHITUNGAN =====");
        System.out.println("Harga Awal  : Rp" + HARGA);
        System.out.println("Diskon 10%  : Rp" + potongan);
        System.out.println("Harga Akhir : Rp" + hargaAkhir);

        // Catatan:
        // HARGA dan DISKON merupakan konstanta karena menggunakan final.
        // Contoh: HARGA = 20000; akan menghasilkan ERROR
        // karena nilai HARGA tidak boleh diubah.
    }
}
