public class MataKuliah {
    
    /*ATRIBUT*/
    private String idMatkul;
    private String namamatkul;
    private Integer sksmatkul;

    /*METHOD*/
    //SETTER
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNamaMatkul(String namamatkul){
        this.namamatkul = namamatkul;
    }

    public void setSKSMatkul(Integer sks){
        this.sksmatkul = sks;
    }

    //Getter
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNamaMatkul(){
        return namamatkul;
    }

    public Integer getSKSMatkul(){
        return sksmatkul;
    }

    //Konstruktor Tanpa Parameter
     public MataKuliah(){
        
    }

    //Konstruktor dengan Parameter
    public MataKuliah(String idMatkul,String namamatkul,Integer sks){
        this.idMatkul = idMatkul;
        this.namamatkul = namamatkul;
        this.sksmatkul = sks;
    }

}
