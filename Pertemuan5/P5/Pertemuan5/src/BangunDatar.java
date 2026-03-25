/*
File : BangunDatar.java
Deskripsi : Kelas abstrak BangunDatar sebagai kelas induk untuk bangun datar lainnya
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 18 Maret 2026
*/

public abstract class BangunDatar {

    // Atribut BangunDatar
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterbangundatar = 0;

    // Konstruktor BangunDatar tanpa parameter
    public BangunDatar() {
        counterbangundatar++;
    }

    // Konstruktor BangunDatar dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterbangundatar++;
    }

    // Getter dan Setter
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Method untuk menampilkan informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    public void printCounter() {
        System.out.println("Total BangunDatar: " + counterbangundatar);
    }


    // Abstract method getLuas dan getKeliling
    public abstract double getLuas();
    public abstract double getKeliling();

    // Method untuk mengecek apakah luas dua bangun datar sama
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Method untuk mengecek apakah keliling dua bangun datar sama
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}