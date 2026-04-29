// file : Main_Seminar.java
// deskripsi : Program utama (main) untuk simulasi seminar dengan dosen dan mahasiswa
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Main_Seminar {
    public static void main(String[] args) {

        // (e) buat 2 objek dosen
        Dosen d1 = new Dosen("NIP001", "Dr. Budi Hartono");
        Dosen d2 = new Dosen("NIP002", "Prof. Sari Indah");

        // (e) buat 5 objek mahasiswa
        MahasiswaCivitas mhs1 = new MahasiswaCivitas("24060001", "Andi Firmansyah");
        MahasiswaCivitas mhs2 = new MahasiswaCivitas("24060002", "Bella Saputri");
        MahasiswaCivitas mhs3 = new MahasiswaCivitas("24060003", "Candra Wijaya");
        MahasiswaCivitas mhs4 = new MahasiswaCivitas("24060004", "Dina Maharani");
        MahasiswaCivitas mhs5 = new MahasiswaCivitas("24060005", "Eko Prasetyo");

        // buat objek seminar
        Seminar seminar = new Seminar();

        // (f) registrasi semua peserta
        System.out.println("=== Registrasi Peserta ===");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);

        // (c) tampil count peserta
        System.out.println("\n=== (c) Count Peserta ===");
        System.out.println("Total peserta seminar: " + seminar.countPeserta());

        // (g) tampil daftar peserta
        // (dalam tampilPeserta sudah ada println headernya)
        seminar.tampilPeserta();

        // (h) count mahasiswa
        System.out.println("\n=== (h) Count Mahasiswa ===");
        System.out.println("Banyak peserta mahasiswa: " + seminar.countMahasiswa());

        // (i) setWali untuk beberapa mahasiswa
        System.out.println("\n=== (i) Set Dosenwali ===");
        mhs1.setWali(d1);
        mhs2.setWali(d1);
        mhs3.setWali(d2);
        mhs4.setWali(d2);
        // mhs5 sengaja ga dikasih wali buat ngetes kondisi null
        System.out.println("Dosenwali sudah diset.");

        // (j) tampil data mahasiswa lengkap
        System.out.println("\n=== (j) Data Mahasiswa Lengkap ===");
        mhs1.tampilDataMahasiswa();
        mhs2.tampilDataMahasiswa();
        mhs3.tampilDataMahasiswa();
        mhs4.tampilDataMahasiswa();
        mhs5.tampilDataMahasiswa();  // ini harusnya "Belum ada wali"
    }
}
