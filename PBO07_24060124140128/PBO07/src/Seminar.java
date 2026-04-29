// file : Seminar.java
// deskripsi : Kelas Seminar dengan array statis peserta, fungsi registrasi, tampil, dan count
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Seminar {

    // array statis maksimal 100 orang
    private Civitasakademika[] pesertas = new Civitasakademika[100];
    private int banyakpeserta;

    // konstruktor - inisialisasi banyakpeserta = 0
    public Seminar() {
        banyakpeserta = 0;
    }

    // (c) hitung banyaknya peserta
    public int countPeserta() {
        return banyakpeserta;
    }

    // (d) registrasi peserta - selalu kontigu, tidak loncat2
    public void registrasi(Civitasakademika c) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
            System.out.println(c.getNama() + " berhasil diregistrasi.");
        } else {
            System.out.println("Maaf, kursi seminar sudah penuh!");
        }
    }

    // (g) tampilkan daftar nomor dan nama semua peserta
    public void tampilPeserta() {
        System.out.println("\n--- Daftar Peserta Seminar ---");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i+1) + ". Nomor: " + pesertas[i].getNomor() + " | Nama: " + pesertas[i].getNama());
        }
        System.out.println("Total peserta: " + banyakpeserta);
    }

    // (h) hitung banyaknya peserta mahasiswa saja, pakai instanceof
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof MahasiswaCivitas) {
                count++;
            }
        }
        return count;
    }
}
