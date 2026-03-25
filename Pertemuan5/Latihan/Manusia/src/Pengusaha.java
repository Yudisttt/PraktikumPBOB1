/*
File : Pengusaha.java
Deskripsi : Kelas Pengusaha yang extends Manusia dan implements Pajak
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 24 Maret 2026
*/

import java.util.Date;

public class Pengusaha extends Manusia implements Pajak {

    // Atribut khusus Pengusaha
    private String npwp;
    private static int counterPengusaha = 0;

    // Nilai B dari NIM (digit ke-13 = 2)
    private int B = 2;

    //Konstruktor
    public Pengusaha(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //Getter
    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    //Setter
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Rumus Pengusaha: (now - tgl_mulai_kerja) + B
    @Override
    public int hitungMasaKerja() {
        Date sekarang = new Date();

        // selisih dalam milidetik lalu konversi ke tahun
        long selisihMilidetik = sekarang.getTime() - getTglMulaiKerja().getTime();
        int tahun = (int) (selisihMilidetik / (1000L * 60 * 60 * 24 * 365));

        return tahun + B;
    }

    // Rumus Pengusaha: 15% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    // Override cetakInfo untuk mencetak atribut Pengusaha juga
    @Override
    public void cetakInfo() {
        System.out.println("===== Info Pengusaha =====");
        super.cetakInfo();
        System.out.println("NPWP          : " + npwp);
        System.out.println("==========================");
    }
}