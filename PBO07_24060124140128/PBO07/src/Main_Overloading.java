// file : Main_Overloading.java
// deskripsi : Program utama untuk menguji overloading operator dan konstruktor kelas Mahasiswa
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Main_Overloading {
    public static void main(String[] args) {

        // === (a) & (b) uji semua varian setProgramStudi ===
        System.out.println("=== (b) Uji Varian setProgramStudi ===");

        Mahasiswa m1 = new Mahasiswa("24060001", "Budi Santoso", "Informatika");
        System.out.print("Sebelum: ");
        m1.tampilInfo();

        // varian 1 - tanpa parameter
        m1.setProgramStudi();
        System.out.print("Setelah setProgramStudi() tanpa param: ");
        m1.tampilInfo();

        // varian 2 - dengan string
        m1.setProgramStudi("Sistem Informasi");
        System.out.print("Setelah setProgramStudi(String): ");
        m1.tampilInfo();

        // varian 3 - dari objek mahasiswa lain
        Mahasiswa m2 = new Mahasiswa("24060002", "Citra Dewi", "Teknik Elektro");
        m1.setProgramStudi(m2);
        System.out.print("Setelah setProgramStudi(Mahasiswa): ");
        m1.tampilInfo();

        // === (c) konstruktor tanpa parameter ===
        System.out.println("\n=== (c) Konstruktor Default ===");
        Mahasiswa mDefault = new Mahasiswa();
        mDefault.tampilInfo();

        // === (d) konstruktor tiga parameter ===
        System.out.println("\n=== (d) Konstruktor 3 Parameter ===");
        Mahasiswa m3 = new Mahasiswa("24060003", "Andi Wijaya", "Informatika");
        m3.tampilInfo();

        // === (e) konstruktor kloning ===
        System.out.println("\n=== (e) Konstruktor Kloning ===");
        Mahasiswa mKlon = new Mahasiswa(m3);
        System.out.print("Original : ");
        m3.tampilInfo();
        System.out.print("Klon     : ");
        mKlon.tampilInfo();

        // bukti bahwa klon beda objek (ubah nama klon, original ga berubah)
        mKlon.nama = "Klon Andi";
        System.out.println("Setelah nama klon diubah:");
        System.out.print("Original : ");
        m3.tampilInfo();
        System.out.print("Klon     : ");
        mKlon.tampilInfo();
    }
}
