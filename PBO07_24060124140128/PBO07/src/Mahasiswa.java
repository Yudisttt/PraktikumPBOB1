// file : Mahasiswa.java
// deskripsi : Kelas Mahasiswa dengan overloading setProgramStudi dan overloading konstruktor
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Mahasiswa {

    // atribut
    String nim;
    String nama;
    String programStudi;

    // === konstruktor (c) - tanpa parameter, nilai default ===
    public Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }

    // === konstruktor (d) - tiga parameter ===
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // === konstruktor (e) - kloning dari objek Mahasiswa lain ===
    public Mahasiswa(Mahasiswa lain) {
        this.nim = lain.nim;
        this.nama = lain.nama;
        this.programStudi = lain.programStudi;
    }

    // === overloading setProgramStudi ===

    // varian 1 - tanpa parameter
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    // varian 2 - satu parameter string
    public void setProgramStudi(String ps) {
        this.programStudi = ps;
    }

    // varian 3 - satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa lain) {
        this.programStudi = lain.programStudi;
    }

    // getter biasa
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getProgramStudi() { return programStudi; }

    // buat nampilin info mahasiswa
    public void tampilInfo() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + programStudi);
    }
}
