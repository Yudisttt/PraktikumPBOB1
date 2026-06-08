/*
File : Petani.java
Deskripsi : Kelas Petani yang extends Manusia dan implements Pajak
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 24 Maret 2026
*/

import java.util.Date;

public class Petani extends Manusia implements Pajak {

    // Atribut khusus Petani
    private String asal_kota;
    private static int counterPetani = 0;

    // Nilai C dari NIM (digit ke-12 = 1)
    private int C = 1;

    //konstruktor
    public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //Getter
    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    // Setter
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    // Rumus Petani: (now - tgl_mulai_kerja) + C
    @Override
    public int hitungMasaKerja() {
        Date sekarang = new Date();

        //selisih dalam milidetik lalu konversi ke tahun
        long selisihMilidetik = sekarang.getTime() - getTglMulaiKerja().getTime();
        int tahun = (int) (selisihMilidetik / (1000L * 60 * 60 * 24 * 365));

        return tahun + C;
    }

    //Petani tidak dikenakan pajak
    @Override
    public double hitungPajak() {
        return 0;
    }

    // Override cetakInfo untuk mencetak atribut Petani juga
    @Override
    public void cetakInfo() {
        System.out.println("===== Info Petani =====");
        super.cetakInfo();
        System.out.println("Asal Kota     : " + asal_kota);
        System.out.println("=======================");
    }
}