// file : MahasiswaCivitas.java
// deskripsi : Kelas Mahasiswa (konteks seminar) turunan Civitasakademika, punya NIM dan Dosenwali
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

// nama kelasnya MahasiswaCivitas biar ga bentrok sama kelas Mahasiswa di bagian II
public class MahasiswaCivitas extends Civitasakademika {

    private String nim;
    private Dosen dosenwali;   // bisa null kalau belum ada wali

    public MahasiswaCivitas(String nim, String nama) {
        super(nama);
        this.nim = nim;
        this.dosenwali = null;
    }

    public String getNim() {
        return nim;
    }

    // getNomor return NIM untuk mahasiswa
    @Override
    public String getNomor() {
        return nim;
    }

    // (i) prosedur setWali
    public void setWali(Dosen d) {
        this.dosenwali = d;
    }

    // (j) tampil data mahasiswa lengkap dengan dosenwali
    public void tampilDataMahasiswa() {
        String namaWali = (dosenwali != null) ? dosenwali.getNama() : "Belum ada wali";
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Dosenwali: " + namaWali);
    }
}
