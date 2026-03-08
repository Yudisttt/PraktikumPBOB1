/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Ida Bagus Ngurah Yudistira K
 * Tanggal      : 4 Maret 2026
 * 
 */

public class Kendaraan {

    /*ATRIBUT*/
    private String Noplat;
    private String JenisKendaraan;

    /*METHOD*/
    //SETTER
    public void setNoplat(String noplat){
        this.Noplat = noplat;
    }

    public void setJenisKendaraan(String jenisKendaraan){
        this.JenisKendaraan = jenisKendaraan;
    }

    //GETTER
    public String getNoplat(){
        return Noplat;
    }

    public String getJenisKendaraan(){
        return JenisKendaraan;
    }

    //Konstruktor Kendaraan Tanpa Parameter
    public Kendaraan(){
        
    }

    //Konstruktor Kendaraan Dengan Parameter
    public Kendaraan(String noplat,String jenisKendaraan){
        this.Noplat = noplat;
        this.JenisKendaraan = jenisKendaraan;
    }
    @Override
    public String toString() {
    return "noPlat: " + Noplat +
           ", Jenis Kendaraan: " + JenisKendaraan;
    }

}
