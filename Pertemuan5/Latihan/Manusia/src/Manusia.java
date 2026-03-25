/*
File : Manusia.java
Deskripsi : Abstract class yang merepresentasikan manusia secara umum
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 24 Maret 2026
*/

import java.util.Date;

public abstract class Manusia {

    // Atribut
    private String nama;
    private Date tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    // Constructor
    public Manusia(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //Getter
    public String getNama() {
        return nama;
    }

    public Date getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulaiKerja(Date tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Method cetakInfo 
    public void cetakInfo() {
        System.out.println("Nama          : " + nama);
        System.out.println("Tgl Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Pendapatan    : " + pendapatan);
    }

    // Abstract method hitungMasaKerja yang harus diimplementasikan oleh subclass
    public abstract int hitungMasaKerja();
}