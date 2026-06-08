/**
 * File        : AngkaSialException.java
 * Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama        : Ida Bagus Ngurah Yudistira K
 * NIM         : 24060124140128
 * Tanggal     : 31 Maret 2026
 */
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
