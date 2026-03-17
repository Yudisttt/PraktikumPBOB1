import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("123456789", "Budi Santoso", LocalDate.of(1990, 5, 15), LocalDate.of(2015, 3, 1), 5000000);
        Pegawai pegawai2 = new Pegawai("987654321", "Siti Aminah", LocalDate.of(1985, 8, 20), LocalDate.of(2010, 7, 15), 6000000);

        System.out.println("Informasi Pegawai 1:");
        pegawai1.printInfo();
        System.out.println("Masa Kerja: " + pegawai1.hitungMasaKerja().getYears() + " tahun");

        System.out.println("\nInformasi Pegawai 2:");
        pegawai2.printInfo();
        System.out.println("Masa Kerja: " + pegawai2.hitungMasaKerja().getYears() + " tahun");
    }
}