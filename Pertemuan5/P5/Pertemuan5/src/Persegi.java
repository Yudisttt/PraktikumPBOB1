/*
File : Persegi.java
Deskripsi : Kelas Persegi sebagai kelas turunan dari BangunDatar
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 18 Maret 2026
*/

public class Persegi extends BangunDatar implements IResize {
 
    private double sisi;
    private static int counterpersegi = 0;
 
    // Konstruktor tanpa parameter
    public Persegi() {
        setJmlSisi(4);
        counterpersegi++;
    }
 
    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setJmlSisi(4);
        setWarna(warna);
        setBorder(border);
        counterpersegi++;
    }
 
    // Getter dan Setter
    public double getSisi() {
        return sisi;
    }
 
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
 
    // Implementasi abstract method getLuas dari BangunDatar
    @Override
    public double getLuas() {
        return sisi * sisi;
    }
 
    // Implementasi abstract method getKeliling dari BangunDatar
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
 
    // Mencari diagonal Persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
 
    // Print info Persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
    }
 
    @Override
    public void printCounter() {
        System.out.println("Total Persegi: " + counterpersegi);
    }
 
 
    @Override
    public void zoomIn() {
        // Memperbesar ukuran persegi sebesar 10%
        sisi = sisi * 1.1;
    }
 
    @Override
    public void zoomOut() {
        // Memperkecil ukuran persegi sebesar 10%
        sisi = sisi * 0.9;
    }
 
    @Override
    public void zoom(int percent) {
        // Mengubah ukuran persegi sesuai persentase yang diberikan
        sisi = sisi * percent / 100.0;
    }
}