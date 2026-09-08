public class Days07 {
    public static void main(String[] args) {

        // String merupakan tipe data non-primitif yang digunakan
        // untuk menyimpan data berupa teks atau kumpulan karakter.
        // Penulisan nilai String menggunakan tanda petik dua (" ").

        String nama = "Muh Rizky Alfajri";
        // Variabel nama digunakan untuk menyimpan nama mahasiswa.

        String nim = "D0426506";
        // Variabel nim digunakan untuk menyimpan nomor induk mahasiswa.

        String jurusan = "Sistem Informasi";
        // Variabel jurusan menyimpan nama program studi mahasiswa.

        String kelas = "A";
        // Variabel kelas digunakan untuk menyimpan kelas mahasiswa.

        String angkatan = "2026";
        // Angkatan ditulis sebagai String karena dianggap sebagai data teks.

        String hobi = "Bermain Badminton";
        // Variabel hobi digunakan untuk menyimpan kegiatan yang disukai.

        // System.out.println() berfungsi untuk menampilkan teks
        // dan nilai variabel ke layar.
        System.out.println("=================================");
        System.out.println("         PROFIL MAHASISWA");
        System.out.println("=================================");

        // Tanda + digunakan untuk menggabungkan teks
        // dengan isi dari variabel String.
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Jurusan   : " + jurusan);
        System.out.println("Kelas     : " + kelas);
        System.out.println("Angkatan  : " + angkatan);
        System.out.println("Hobi      : " + hobi);

        // Bagian ini merupakan penutup tampilan program.
        System.out.println("=================================");
        System.out.println("     Data berhasil ditampilkan");
        System.out.println("=================================");
    }
}
