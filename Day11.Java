import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {

        // Scanner digunakan untuk menerima data yang diketik oleh pengguna
        Scanner input = new Scanner(System.in);

        // Menampilkan judul program
        System.out.println("==================================");
        System.out.println("     INPUT DATA MAHASISWA");
        System.out.println("==================================");

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        // Meminta pengguna memasukkan NIM
        System.out.print("Masukkan NIM  : ");
        String nim = input.nextLine();

        // nextInt() digunakan untuk membaca input berupa bilangan bulat
        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();

        // nextDouble() digunakan untuk membaca angka yang memiliki koma
        System.out.print("Masukkan Tinggi Badan (cm) : ");
        double tinggi = input.nextDouble();

        // Menampilkan kembali data yang telah dimasukkan
        System.out.println("\n==================================");
        System.out.println("        DATA MAHASISWA");
        System.out.println("==================================");

        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Tinggi Badan  : " + tinggi + " cm");

        System.out.println("==================================");

        // close() digunakan untuk menutup Scanner setelah selesai digunakan
        input.close();
    }
}
