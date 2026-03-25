/*
File : MManusia.java
Deskripsi : Main class untuk menjalankan program simulasi manusia dan pajak
Nama : Ida Bagus Ngurah Yudistira K
NIM  : 24060124140128
Tanggal : 24 Maret 2026
*/

import java.util.Date;
import java.util.Calendar;
 
public class MManusia {
 
    public static Date buatTanggal(int hari, int bulan, int tahun) {
        Calendar cal = Calendar.getInstance();
        cal.set(tahun, bulan - 1, hari); // bulan dikurangi 1 karena Calendar mulai dari 0
        return cal.getTime();
    }
 
    public static void main(String[] args) {
 
        //buatTanggal(hari, bulan, tahun)
        PNS p1 = new PNS("Satriyo", buatTanggal(1, 4, 2006), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", buatTanggal(1, 1, 2000), "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", buatTanggal(9, 1, 1977), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", buatTanggal(1, 4, 2010), 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");
 
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
 
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
 
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
 
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}