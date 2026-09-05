public class Main {
    public static void main(String[] args) {

        // byte digunakan untuk menyimpan bilangan bulat kecil
        // Ukuran 8 bit, nilai -128 sampai 127
        byte jumlahPensil = 25;

        // short digunakan untuk menyimpan bilangan bulat yang lebih besar dari byte
        // Ukuran 16 bit, nilai -32.768 sampai 32.767
        short jumlahBuku = 1500;

        // int digunakan untuk menyimpan bilangan bulat yang lebih besar
        // Ukuran 32 bit, nilai -2.147.483.648 sampai 2.147.483.647
        int hargaMotor = 18000000;

        // long digunakan untuk menyimpan bilangan bulat yang sangat besar
        // Ukuran 64 bit, nilai -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807
        // Pada long, angka harus diberi huruf L di belakang
        long hargaMobil = 5000000000L;

        System.out.println("Jumlah Pensil : " + jumlahPensil);
        System.out.println("Jumlah Buku   : " + jumlahBuku);
        System.out.println("Harga Motor   : " + hargaMotor);
        System.out.println("Harga Mobil   : " + hargaMobil);
    }
}
