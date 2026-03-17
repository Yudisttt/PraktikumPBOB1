import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {

    private String bidang;

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = tanggalLahir.plusYears(55);
        return LocalDate.of(pensiun.getYear(), pensiun.getMonth().plus(1), 1);
    }

    public double hitungTunjangan() {
        Period masaKerja = hitungMasaKerja();
        return 0.01 * masaKerja.getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {

        Period masaKerja = hitungMasaKerja();

        super.printInfo();
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);

        System.out.println("Masa Kerja : " +
                masaKerja.getYears() + " tahun " +
                masaKerja.getMonths() + " bulan");

        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun()));

        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}