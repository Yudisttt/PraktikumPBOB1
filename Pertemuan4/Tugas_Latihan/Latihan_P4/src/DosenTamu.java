import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends DosenP4 {

    private String nidk;
    private LocalDate akhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir,
                     LocalDate tmt, double gajiPokok, String fakultas, LocalDate akhirKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public Period sisaKontrak() {
        return Period.between(LocalDate.now(), akhirKontrak);
    }

    @Override
    public void printInfo() {

        Period kontrak = sisaKontrak();

        super.printInfo();
        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);

        System.out.println("Kontrak Berakhir : " + formatTanggal(akhirKontrak));

        System.out.println("Sisa Kontrak : " +
                kontrak.getMonths() + " bulan");

        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}