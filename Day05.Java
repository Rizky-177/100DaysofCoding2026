public class day05 {
    public static void main(String[] args) {

        // Membuat variabel dengan tipe data double
        // double digunakan untuk menyimpan angka yang memiliki nilai desimal
        double tugas = 85.5;
        double uts = 80.0;
        double uas = 90.5;

        // Menjumlahkan seluruh nilai tugas, UTS, dan UAS
        double jumlah = tugas + uts + uas;

        // Menghitung nilai rata-rata dengan membagi jumlah nilai dengan 3
        double rataRata = jumlah / 3;

        // Menampilkan judul program
        System.out.println("=============================");
        System.out.println("       NILAI MAHASISWA");
        System.out.println("=============================");
        System.out.println();

        // Menampilkan masing-masing nilai mahasiswa
        System.out.println("Nilai Tugas : " + tugas);
        System.out.println("Nilai UTS   : " + uts);
        System.out.println("Nilai UAS   : " + uas);
        System.out.println();

        // Menampilkan hasil perhitungan nilai rata-rata
        System.out.println("Rata-rata   : " + rataRata);
    }
}
