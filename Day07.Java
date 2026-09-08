public class Day07 {
    public static void main(String[] args) {

        // String digunakan untuk menyimpan data berupa teks.
        String nama = "Muh Rizky Alfajri";

        // String dapat digunakan untuk menyimpan nama kegiatan.
        String kegiatan = "Belajar Pemrograman Java";

        // String juga dapat menyimpan kalimat atau pesan.
        String pesan = "Saya sedang mempelajari tipe data String.";

        // Menampilkan judul program ke layar.
        System.out.println("=== PENGENALAN TIPE DATA STRING ===");

        // Menampilkan nama yang tersimpan di dalam variabel String.
        System.out.println("Nama     : " + nama);

        // Menampilkan kegiatan yang tersimpan dalam variabel String.
        System.out.println("Kegiatan : " + kegiatan);

        // Menampilkan pesan yang berupa teks.
        System.out.println("Pesan    : " + pesan);

        // Tanda + digunakan untuk menggabungkan beberapa teks/String.
        String kesimpulan = nama + " sedang " + kegiatan;

        // Menampilkan hasil penggabungan String.
        System.out.println("Kesimpulan: " + kesimpulan);
    }
}
