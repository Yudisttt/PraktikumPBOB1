import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends DosenP4 {

    private String nidn;

    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir,
                      LocalDate tmt, double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = tanggalLahir.plusYears(65);
        return LocalDate.of(pensiun.getYear(), pensiun.getMonth().plus(1), 1);
    }

    public double hitungTunjangan() {
        Period masaKerja = hitungMasaKerja();
        return 0.02 * masaKerja.getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {

        Period masaKerja = hitungMasaKerja();

        super.printInfo();
        System.out.println("NIDN : " + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);

        System.out.println("Masa Kerja : " +
                masaKerja.getYears() + " tahun " +
                masaKerja.getMonths() + " bulan");

        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun()));

        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}