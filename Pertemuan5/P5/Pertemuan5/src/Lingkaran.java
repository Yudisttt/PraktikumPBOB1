/*
File : Lingkaran.java
Deskripsi : Kelas Lingkaran sebagai kelas turunan dari BangunDatar
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 18 Maret 2026
*/

public class Lingkaran extends BangunDatar implements IResize {
 
    private double jariJari;
    private static int counterlingkaran = 0;
 
    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(0); // Lingkaran tidak punya sisi
        counterlingkaran++;
    }
 
    // Konstruktor dengan parameter
    public Lingkaran(double jariJari, String warna, String border) {
        this.jariJari = jariJari;
        setJmlSisi(0);
        setWarna(warna);
        setBorder(border);
        counterlingkaran++;
    }
 
    // Getter dan Setter Lingkaran
    public double getJari() {
        return jariJari;
    }
 
    public void setJari(double jariJari) {
        this.jariJari = jariJari;
    }
 
    // Implementasi abstract method getLuas dari BangunDatar
    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }
 
    // Implementasi abstract method getKeliling dari BangunDatar
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }
 
    // Print info Lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari   : " + jariJari);
    }
 
    @Override
    public void printCounter() {
        System.out.println("Total Lingkaran: " + counterlingkaran);
    }
 
 
    @Override
    public void zoomIn() {
        // Memperbesar ukuran lingkaran sebesar 10%
        jariJari = jariJari * 1.1;
    }
 
    @Override
    public void zoomOut() {
        // Memperkecil ukuran lingkaran sebesar 10%
        jariJari = jariJari * 0.9;
    }
 
    @Override
    public void zoom(int percent) {
        // Mengubah ukuran lingkaran sesuai persentase yang diberikan
        jariJari = jariJari * percent / 100.0;
    }
}