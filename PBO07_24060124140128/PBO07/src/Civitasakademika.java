// file : Civitasakademika.java
// deskripsi : Kelas induk abstrak untuk Dosen dan Mahasiswa dalam konteks Seminar
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public abstract class Civitasakademika {

    protected String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // masing2 kelas anak override ini, dosen return NIP, mahasiswa return NIM
    public abstract String getNomor();
}
