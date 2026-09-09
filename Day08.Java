public class Days08 {
    public static void main(String[] args) {

        // Deklarasi variabel
        // Deklarasi adalah proses membuat variabel tanpa memberikan nilai terlebih dahulu.
        String nama;
        int umur;
        String jurusan;

        // Inisialisasi variabel
        // Inisialisasi adalah memberikan nilai awal kepada variabel.
        nama = "Muh Rizky Alfajri";
        umur = 18;
        jurusan = "Sistem Informasi";

        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("Jurusan : " + jurusan);

        // Update variabel
        // Update adalah mengubah nilai variabel yang sebelumnya sudah memiliki nilai.
        umur = 19;
        nama = "Muh Rizky Alfajri";

        System.out.println("\n=== DATA SETELAH DIUPDATE ===");
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("Jurusan : " + jurusan);
    }
}
