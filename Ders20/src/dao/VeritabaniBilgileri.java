package dao;

public enum VeritabaniBilgileri {

    //; varsa enumlar çalışır.Mülakat sorusu
    CONNECTION_URL("jdbc:postgresql://localhost:5432/postgres?currentSchema=public"),
    USERNAME("postgres"),
    PASSWORD("root");

    private String value;

    private VeritabaniBilgileri(String value){
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }
}