import java.util.ArrayList;

public class Mahasiswa {

    /*****************ATRIBUT*******************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> ListMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    /*******************METHOD*********************/
    //SETTER
    public void setNim(String nim){ //Menetapkan NIM Mahasiswa
        this.nim = nim;
    }

    public void setNama(String nama){ //Menetapkan Nama mahasiswa
        this.nama = nama;
    }

    public void setProdi(String prodi){ //Menetapkan Prodi mahasiswa
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){ //Menetapkan DosenWali
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){ //Menetapkan Kendaraan Mahasiswa
        this.kendaraan = kendaraan;
    }

    //GETTER
    public String getNim(){ //Mengembalikan NIM
        return nim;
    }

    public String getNama(){ //Mengembalikan Nama Mahasiswa
        return nama;
    }

    public String getProdi(){ //Mengembalikan Prodi Mahasiswa
        return prodi;
    }

    public Dosen getDosenWali(){ //Mengembalikan Dosen Wali Mahasiswa
        return dosenWali;
    }

    public Kendaraan getKendaraan(){ //Mengembalikan Kendaraan Mahasiswa
        return kendaraan;
    }

    //Konstruktor Mahasiswa tanpa parameter
    public Mahasiswa(){
        this.ListMatkul = new ArrayList<>(); //Inisialisasi array kosong
    }

    //Konstruktor Mahasiswa dengan parameter
    public Mahasiswa(String nim,String nama,String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ListMatkul = new ArrayList<>(); //Inisialisasi array kosong
    }   

    public void addMatkul(MataKuliah newMatKul){ //Menambahkan Mata kuliah
        ListMatkul.add(newMatKul);
    }


    public void printmhs(){ //Print mahasiswa
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs(){ //Print detail Mahasiswa
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("DosenWali: " + dosenWali);
        System.out.println("Kendaraan: " + kendaraan);

    }

    public Integer getJumlahSKS(){ //Mengembalikan Jumlah SKS yang diambil Mahasiswa
        int totalSKS = 0;
        for (MataKuliah matkul : ListMatkul) {
            totalSKS += matkul.getSKSMatkul();
        }
        System.out.println("Total SKS yang diambil: " + totalSKS);
        return totalSKS;
    }

    public Integer getJumlahMatkul(){ //Mengembalikan Jumlah Matkul yang diambil Mahasiswa
        int jumlahMatkul = ListMatkul.size();
        System.out.println("Jumlah Matkul yang diambil: " + jumlahMatkul);
        return jumlahMatkul;
    }


}