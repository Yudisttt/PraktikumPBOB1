/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Ida Bagus Ngurah Yudistira K
 * Tanggal      : 4 Maret 2026
 * 
 */

public class Dosen {

    /*ATRIBUT*/

    private String nip;
    private String nama;
    private String prodi;

    /* METHOD*/
    //SETTER
    public void setNipDosen(String nip){
        this.nip = nip;
    }
    public void setNamaDosen(String nama){
        this.nama = nama;
    }
    public void setProdiDosen(String prodi){
        this.prodi = prodi;
    }

    //GETTER
    public String getNIPDosen(){ //Mengembalikan NIP Dosen
        return nip;
    }

    public String getNamaDosen(){ //Mengembalikan Nama Dosen
        return nama;
    }

    public String getProdiDosen(){ //Mengembalikan Prodi Dosen
        return prodi;
    }


    //Konstruktor Dosen Tanpa Parameter
    public Dosen(){
        
    }

    //Konstruktor Dosen Dengan Parameter
    public Dosen(String nip,String nama,String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }


    public void printDetailDosen(){
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    @Override
    public String toString() {
    return "NIP: " + nip +
           ", Nama: " + nama +
           ", Prodi: " + prodi;
    }


}
