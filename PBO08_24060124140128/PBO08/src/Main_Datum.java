// file : Main_Datum.java
// deskripsi : Program utama untuk ilustrasi kelas generik Datum + aplikasi keluarga Anabul
// Nama : Ida Bagus Ngurah Yudistira K
// NIM  : 24060124140128

public class Main_Datum {
    public static void main(String[] args) {

        System.out.println("=== Ilustrasi Kelas Generik Datum ===\n");

        // Datum berisi Integer
        Datum<Integer> datumAngka = new Datum<>(42);
        System.out.println("Datum Integer awal : " + datumAngka.getIsi());
        datumAngka.setIsi(100);
        System.out.println("Datum Integer setelah setIsi : " + datumAngka.getIsi());

        System.out.println();

        // Datum berisi String
        Datum<String> datumKata = new Datum<>("Halo");
        System.out.println("Datum String awal : " + datumKata.getIsi());
        datumKata.setIsi("Dunia");
        System.out.println("Datum String setelah setIsi : " + datumKata.getIsi());

        System.out.println();

        // Datum berisi objek Anabul (keluarga Kucing)
        System.out.println("=== Aplikasi Datum dengan Keluarga Anabul ===\n");

        Kucing mochi = new Kucing("Mochi", 3.5);
        Datum<Kucing> datumKucing = new Datum<>(mochi);
        System.out.println("Datum Kucing awal : " + datumKucing.getIsi().getNama()
                + " (bobot: " + datumKucing.getIsi().getBobot() + " kg)");
        datumKucing.getIsi().bersuara();
        datumKucing.getIsi().gerak();

        System.out.println();

        // ganti isi datum dengan kucing lain
        Anggora bella = new Anggora("Bella", 4.2);
        datumKucing.setIsi(bella);
        System.out.println("Datum Kucing setelah setIsi : " + datumKucing.getIsi().getNama()
                + " (bobot: " + datumKucing.getIsi().getBobot() + " kg)");
        datumKucing.getIsi().bersuara();
        datumKucing.getIsi().gerak();

        System.out.println();

        // Datum berisi Anabul (tipe induk)
        Datum<Anabul> datumAnabul = new Datum<>(new Burung("Tweety"));
        System.out.println("Datum Anabul berisi : " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().bersuara();

        // ganti dengan Anjing
        datumAnabul.setIsi(new Anjing("Rocky"));
        System.out.println("Datum Anabul setelah setIsi : " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().bersuara();
    }
}
