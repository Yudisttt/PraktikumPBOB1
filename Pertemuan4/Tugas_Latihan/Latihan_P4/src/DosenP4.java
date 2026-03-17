import java.time.LocalDate;

public abstract class DosenP4 extends Pegawai {

    protected String fakultas;

    public DosenP4(String nip, String nama, LocalDate tanggalLahir,
                 LocalDate tmt, double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + fakultas);
    }

}