public class Days06 {
    public static void main(String[] args) {

        // String digunakan untuk menyimpan teks atau kalimat.
        String namaMahasiswa = "Muh Rizky Alfajri";

        // char digunakan untuk menyimpan satu karakter saja.
        // Karakter pada char ditulis menggunakan tanda petik satu (' ').
        char kelas = 'A';

        // boolean digunakan untuk menyimpan nilai benar atau salah.
        // Nilainya hanya true atau false dan tidak menggunakan tanda petik.
        boolean mahasiswaAktif = true;


        // Menampilkan garis sebagai pembatas tampilan.
        System.out.println("==============================");

        // Menampilkan judul data mahasiswa.
        System.out.println("       DATA MAHASISWA");

        // Menampilkan garis pembatas.
        System.out.println("==============================");


        // Menampilkan nama mahasiswa.
        System.out.println("Nama           : " + namaMahasiswa);

        // Menampilkan karakter yang tersimpan pada variabel kelas.
        System.out.println("Kelas          : " + kelas);

        // Menampilkan status mahasiswa.
        // Jika true berarti mahasiswa tersebut aktif.
        System.out.println("Status Aktif   : " + mahasiswaAktif);


        // Memberikan jarak satu baris.
        System.out.println();

        // Menampilkan tulisan penutup.
        System.out.println("====== DATA SELESAI ======");
    }
}
