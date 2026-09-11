public class Day10 {
    public static void main(String[] args) {

        // Program ini digunakan untuk melihat batas nilai
        // terkecil dan terbesar yang dapat dimiliki beberapa tipe data Java.

        System.out.println("======================================");
        System.out.println("   BATAS NILAI TIPE DATA JAVA");
        System.out.println("   Nama : Muh Rizky Alfajri");
        System.out.println("======================================");

        // BYTE
        // byte memiliki ukuran kecil dan dapat menyimpan
        // bilangan bulat dari -128 sampai 127.
        System.out.println("\n[1] BYTE");
        System.out.println("Batas bawah : " + Byte.MIN_VALUE);
        System.out.println("Batas atas  : " + Byte.MAX_VALUE);

        // SHORT
        // short digunakan untuk bilangan bulat dengan kapasitas
        // lebih besar daripada byte.
        System.out.println("\n[2] SHORT");
        System.out.println("Batas bawah : " + Short.MIN_VALUE);
        System.out.println("Batas atas  : " + Short.MAX_VALUE);

        // INTEGER
        // int merupakan tipe data bilangan bulat yang
        // sering digunakan dalam program Java.
        System.out.println("\n[3] INTEGER");
        System.out.println("Batas bawah : " + Integer.MIN_VALUE);
        System.out.println("Batas atas  : " + Integer.MAX_VALUE);

        // LONG
        // long mempunyai kapasitas bilangan bulat yang
        // lebih besar dibandingkan int.
        System.out.println("\n[4] LONG");
        System.out.println("Batas bawah : " + Long.MIN_VALUE);
        System.out.println("Batas atas  : " + Long.MAX_VALUE);

        // FLOAT
        // float digunakan untuk menyimpan angka pecahan.
        // MIN_VALUE pada float berarti nilai positif terkecil
        // yang dapat direpresentasikan, bukan bilangan negatif terkecil.
        System.out.println("\n[5] FLOAT");
        System.out.println("Nilai terkecil positif : " + Float.MIN_VALUE);
        System.out.println("Nilai terbesar         : " + Float.MAX_VALUE);

        // DOUBLE
        // double memiliki ketelitian dan kapasitas lebih besar
        // daripada float dalam menyimpan bilangan pecahan.
        System.out.println("\n[6] DOUBLE");
        System.out.println("Nilai terkecil positif : " + Double.MIN_VALUE);
        System.out.println("Nilai terbesar         : " + Double.MAX_VALUE);

        // CHAR
        // char digunakan untuk menyimpan satu karakter.
        // Nilainya dapat ditampilkan sebagai angka berdasarkan
        // kode Unicode karakter tersebut.
        System.out.println("\n[7] CHAR");
        System.out.println("Kode terkecil : " + (int) Character.MIN_VALUE);
        System.out.println("Kode terbesar : " + (int) Character.MAX_VALUE);

        System.out.println("\n======================================");
        System.out.println("Program selesai dijalankan.");
        System.out.println("======================================");
    }
}
