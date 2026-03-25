/*
File : PNS.java
Deskripsi : Kelas PNS yang extends Manusia dan implements Pajak
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 24 Maret 2026
*/

import java.util.Date;

public class PNS extends Manusia implements Pajak {

    // Atribut khusus PNS
    private String nip;
    private static int counterPNS = 0;

    // Nilai A dari NIM (digit ke-14 = 8)
    private int A = 8;

    //Konstruktor dengan parameter 
    public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Konstruktor tanpa parameter 
    public PNS(String nama, Date tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //Getter
    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    // Setter
    public void setNip(String nip) {
        this.nip = nip;
    }

    
    // Rumus PNS: (now - tgl_mulai_kerja) + A
    @Override
    public int hitungMasaKerja() {
        Date sekarang = new Date();

        // selisih dalam milidetik lalu konversi ke tahun
        long selisihMilidetik = sekarang.getTime() - getTglMulaiKerja().getTime();
        int tahun = (int) (selisihMilidetik / (1000L * 60 * 60 * 24 * 365));

        return tahun + A;
    }

    
    // Rumus PNS: 10% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.10 * getPendapatan();
    }

    // Override cetakInfo untuk mencetak atribut PNS juga
    @Override
    public void cetakInfo() {
        System.out.println("===== Info PNS =====");
        super.cetakInfo();
        System.out.println("NIP           : " + nip);
        System.out.println("====================");
    }
}